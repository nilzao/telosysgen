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
public class RootToTbDatabaseTest {

	@Autowired
	private TestEntityManager entityManager;

	@Test
	public void convertTest() throws Exception {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("h2test.dbrep").getFile());
		String dbrepString = new String(Files.readAllBytes(file.toPath()));
		Root root = UnmarshalXML.unMarshal(dbrepString, Root.class);
		RootToTbDatabase rootToTbDatabase = new RootToTbDatabase();
		TbDatabaseJpaRecord tbDatabaseJpaRecord = rootToTbDatabase.convert(root);
		entityManager.persistAndFlush(tbDatabaseJpaRecord);
	}
}
