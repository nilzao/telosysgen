package org.telosysgen.view;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("treemenu")
public class TreeMenuController {

	@GetMapping("/{id}")
	public String treeMenu(@PathVariable String id) {
		StringBuilder stringBuilder = new StringBuilder();
		if ("db".equals(id)) {
			stringBuilder.append("{\n");
			stringBuilder.append("	\"table\": [\n");
			stringBuilder.append("		{\n");
			stringBuilder.append("			\"text\": \"TB_COLUMN\",\n");
			stringBuilder.append("			\"id\": 1,\n"
					+ "\"xtypeTmp\": \"tablelist\", "
					+ "\"treetype\": \"testtype\" ");
			stringBuilder.append("		},\n");
			stringBuilder.append("		{\n");
			stringBuilder.append("			\"text\": \"TB_DATABASE\",\n");
			stringBuilder.append("			\"id\": 2\n");
			stringBuilder.append("		},\n");
			stringBuilder.append("		{\n");
			stringBuilder.append("			\"text\": \"TB_FK\",\n");
			stringBuilder.append("			\"id\": 3\n");
			stringBuilder.append("		},\n");
			stringBuilder.append("		{\n");
			stringBuilder.append("			\"text\": \"TB_LINK\",\n");
			stringBuilder.append("			\"id\": 4\n");
			stringBuilder.append("		},\n");
			stringBuilder.append("		{\n");
			stringBuilder.append("			\"text\": \"TB_TABLE\",\n");
			stringBuilder.append("			\"id\": 5\n");
			stringBuilder.append("		}\n");
			stringBuilder.append("	]\n");
			stringBuilder.append("}\n");
		}
		return stringBuilder.toString();
	}
}
