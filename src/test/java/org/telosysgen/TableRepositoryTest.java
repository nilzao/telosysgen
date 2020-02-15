package org.telosysgen;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class TableRepositoryTest {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private TableRepository tableRepository;

	@Before
	public void saveTable() {
		TbDatabaseJpaRecord tbDatabaseJpaRecord = new TbDatabaseJpaRecord();
		tbDatabaseJpaRecord.setDatabaseName("arroy");
		TbTableJpaRecord tbTableJpaRecord = new TbTableJpaRecord();
		tbTableJpaRecord.setName("table test");
		tbTableJpaRecord.setDatabase(tbDatabaseJpaRecord);
		entityManager.persistAndFlush(tbTableJpaRecord);
	}

	@Test
	public void find() {
		Optional<TbTableJpaRecord> findById = tableRepository.findById(1l);
		assertEquals(findById.get().getName(), "table test");
		assertEquals(findById.get().getDatabase().getDatabaseName(), "arroy");
	}

}
