// These will be displayed in the log file.
//String dbName = System.getProperty("RDS_DB_NAME")
//String user = System.getProperty("RDS_USERNAME")
//String pass = System.getProperty("RDS_PASSWORD")
//String hostname = System.getProperty("RDS_HOSTNAME")
//String port = System.getProperty("RDS_PORT")

//dataSources {
//    dataSource {
//        driverClassName = "com.mysql.jdbc.Driver"
//        dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
//        username = user
//        password = pass
//        dbCreate = "create-drop"  // Will recreate database every time on startup.
//        url = "jdbc:mysql://" + hostname + ':' + port + '/' + dbName
//        properties {
//            jmxEnabled = true
//            initialSize = 5
//            maxActive = 50
//            minIdle = 5
//            maxIdle = 25
//            maxWait = 10000
//            maxAge = 600000
//            timeBetweenEvictionRunsMillis = 5000
//            minEvictableIdleTimeMillis = 60000
//            validationQuery = 'SELECT 1'
//            validationQueryTimeout = 3
//            validationInterval = 15000
//            testOnBorrow = true
//            testWhileIdle = true
//            testOnReturn = false
//            jdbcInterceptors = 'ConnectionState'
//            defaultTransactionIsolation = 2 //# TRANSACTION_READ_COMMITTED
//        }
//    }
//}./grade