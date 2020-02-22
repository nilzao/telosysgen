package org.telosysgen.upload;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.telosysgen.DataBaseRepository;
import org.telosysgen.TbDatabaseJpaRecord;
import org.telosysgen.jaxb.repo.Root;
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

}