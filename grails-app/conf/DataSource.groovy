dataSource {
	pooled = true
	driverClassName = "com.mysql.jdbc.Driver"
	dialect = org.hibernate.dialect.MySQL5InnoDBDialect
	//logSql = true
}

// environment specific settings
environments {
	development {
		dataSource {
			dbCreate = "update" // one of 'create', 'create-drop','update'
			url = "jdbc:mysql://127.0.0.1:8889/IDTracker?characterEncoding=UTF-8"
			username = "root"
			password = "root"
		}
	}
	
	staging {
		dataSource {

		}
	}
	production {
		dataSource {

		}
	}
}