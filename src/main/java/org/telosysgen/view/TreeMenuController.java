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
		if ("database".equals(id)) {
			stringBuilder.append("{\n");
			stringBuilder.append("	\"treemenu\": [\n");
			stringBuilder.append("		{\n");
			stringBuilder.append("			\"text\": \"databases\",\n");
			stringBuilder.append("			\"id\": 1,\n");
			stringBuilder.append("			\"xtypeTmp\": \"databaselist\"\n");
			stringBuilder.append("		},\n");
			stringBuilder.append("		{\n");
			stringBuilder.append("			\"text\": \"tables\",\n");
			stringBuilder.append("			\"id\": 2,\n");
			stringBuilder.append("			\"xtypeTmp\": \"tablelist\"\n");
			stringBuilder.append("		},\n");
			stringBuilder.append("		{\n");
			stringBuilder.append("			\"text\": \"columns\",\n");
			stringBuilder.append("			\"id\": 3,\n");
			stringBuilder.append("			\"xtypeTmp\": \"columnlist\"\n");
			stringBuilder.append("		},\n");
			stringBuilder.append("		{\n");
			stringBuilder.append("			\"text\": \"fks\",\n");
			stringBuilder.append("			\"id\": 4,\n");
			stringBuilder.append("			\"xtypeTmp\": \"fklist\"\n");
			stringBuilder.append("		},\n");
			stringBuilder.append("		{\n");
			stringBuilder.append("			\"text\": \"links\",\n");
			stringBuilder.append("			\"id\": 5,\n");
			stringBuilder.append("			\"xtypeTmp\": \"linklist\"\n");
			stringBuilder.append("		}\n");
			stringBuilder.append("	]\n");
			stringBuilder.append("}\n");
		}
		return stringBuilder.toString();
	}
}
