package io.github.nilzao.telosysgen.app.upload;

import javax.servlet.http.HttpServletResponse;

import io.github.nilzao.telosysgen.database.Database;
import io.github.nilzao.telosysgen.database.DatabaseRepository;
import io.github.nilzao.telosysgen.app.jaxb.repo.Root;
import io.github.nilzao.telosysgen.app.jaxb.util.DatabaseToRoot;
import io.github.nilzao.telosysgen.app.jaxb.util.MarshalXML;
import io.github.nilzao.telosysgen.app.jaxb.util.RootToTbDatabase;
import io.github.nilzao.telosysgen.app.jaxb.util.UnmarshalXML;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequiredArgsConstructor
public class FileUploadController {

    private final DatabaseRepository databaseRepository;

    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file) {
        try {
            Root root = UnmarshalXML.unMarshal(file.getInputStream(), Root.class);
            RootToTbDatabase rootToTbDatabase = new RootToTbDatabase();
            Database databaseEntity = rootToTbDatabase.convert(root);
            databaseRepository.save(databaseEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/index.html";
    }

    @Transactional
    @GetMapping(value = "/download")
    public void handleFileDownload(HttpServletResponse response) {
        try {
            Iterable<Database> findAll = databaseRepository.findAll();
            Database databaseEntity = findAll.iterator().next();
            response.setContentType("application/xml");
            response.addHeader("Content-Disposition", "attachment; filename=" + databaseEntity.getDatabaseName() + ".dbrep");
            DatabaseToRoot databaseToRoot = new DatabaseToRoot();
            Root convert = databaseToRoot.convert(databaseEntity);
            String marshal = MarshalXML.marshal(convert);
            response.getOutputStream().write(marshal.getBytes());
            response.getOutputStream().flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}