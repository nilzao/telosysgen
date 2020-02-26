package org.telosysgen.jaxb.util;

import java.io.File;
import java.nio.file.Files;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import org.telosysgen.TbDatabaseJpaRecord;
import org.telosysgen.jaxb.repo.Root;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DatabaseToRootTest {

	@Autowired
	private TestEntityManager entityManager;

	@Test
	public void marshallUnmarshall() throws Exception {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("h2test.dbrep").getFile());
		String dbrepString = new String(Files.readAllBytes(file.toPath()));
		Root root = UnmarshalXML.unMarshal(dbrepString, Root.class);
		RootToTbDatabase rootToTbDatabase = new RootToTbDatabase();
		TbDatabaseJpaRecord tbDatabaseJpaRecord = rootToTbDatabase.convert(root);
		entityManager.persistAndFlush(tbDatabaseJpaRecord);

		TbDatabaseJpaRecord tbDatabaseJpaRecordFromDb = entityManager.find(TbDatabaseJpaRecord.class, 1l);
		DatabaseToRoot databaseToRoot = new DatabaseToRoot();
		Root convert = databaseToRoot.convert(tbDatabaseJpaRecordFromDb);
		System.out.println(convert);
		String marshal = MarshalXML.marshal(convert);
		System.out.println(marshal);

	}
}
