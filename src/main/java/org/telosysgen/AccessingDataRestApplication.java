package org.telosysgen;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

// from https://spring.io/guides/gs/accessing-data-rest/
@SpringBootApplication
public class AccessingDataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataRestApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(DataBaseRepository databaseRepo, TableRepository tableRepo) {
		return (args) -> {
//			TbDatabaseJpaRecord tbDatabaseJpaRecord = new TbDatabaseJpaRecord();
//			tbDatabaseJpaRecord.setDatabaseName("arroy");
//			databaseRepo.save(tbDatabaseJpaRecord);
//			TbTableJpaRecord tbTableJpaRecord = new TbTableJpaRecord();
//			tbTableJpaRecord.setDatabase(tbDatabaseJpaRecord);
//			tableRepo.save(tbTableJpaRecord);
		};
	}

}
