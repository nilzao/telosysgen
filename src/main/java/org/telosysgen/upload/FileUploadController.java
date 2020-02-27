package org.telosysgen.upload;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.telosysgen.DataBaseRepository;
import org.telosysgen.TbDatabaseJpaRecord;
import org.telosysgen.jaxb.repo.Root;
import org.telosysgen.jaxb.util.DatabaseToRoot;
import org.telosysgen.jaxb.util.MarshalXML;
import org.telosysgen.jaxb.util.RootToTbDatabase;
import org.telosysgen.jaxb.util.UnmarshalXML;

@Controller
public class FileUploadController {

	@Autowired
	private DataBaseRepository dataBaseRepository;

	@PostMapping("/upload")
	public String handleFileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {
		try {
			Root root = UnmarshalXML.unMarshal(file.getInputStream(), Root.class);
			RootToTbDatabase rootToTbDatabase = new RootToTbDatabase();
			TbDatabaseJpaRecord tbDatabaseJpaRecord = rootToTbDatabase.convert(root);
			dataBaseRepository.save(tbDatabaseJpaRecord);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/";
	}

	@GetMapping(value = "/download")
	public String handleFileDownload(HttpServletRequest request, HttpServletResponse response) {
		try {
			Iterable<TbDatabaseJpaRecord> findAll = dataBaseRepository.findAll();
			TbDatabaseJpaRecord tbDatabaseJpaRecord = findAll.iterator().next();
			response.setContentType("application/xml");
			response.addHeader("Content-Disposition", "attachment; filename=" + tbDatabaseJpaRecord.getDatabaseName() + ".dbrep");
			DatabaseToRoot databaseToRoot = new DatabaseToRoot();
			Root convert = databaseToRoot.convert(tbDatabaseJpaRecord);
			String marshal = MarshalXML.marshal(convert);
			response.getOutputStream().write(marshal.getBytes());
			response.getOutputStream().flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "something wrong";
	}

}