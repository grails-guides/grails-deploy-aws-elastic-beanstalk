String dbName = System.getProperty("RDS_DB_NAME")
String userName = System.getProperty("RDS_USERNAME")
String password = System.getProperty("RDS_PASSWORD")
String hostname = System.getProperty("RDS_HOSTNAME")
String port = System.getProperty("RDS_PORT")

println "PRODUCTION CONFIG AWS EB Deploy"
println dbName + ' ' + userName + ' ' + password + ' ' + hostname + ' ' + port

dataSources {
    dataSource {
        driverClassName = "com.mysql.jdbc.Driver"
        dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
        username = userName
        password = password
        url = "jdbc:mysql://" + hostname + ':' + port + '/' + dbName
        properties {
            jmxEnabled = true
            initialSize = 5
            maxActive = 50
            minIdle = 5
            maxIdle = 25
            maxWait = 10000
            maxAge = 600000
            timeBetweenEvictionRunsMillis = 5000
            minEvictableIdleTimeMillis = 60000
            validationQuery = 'SELECT 1'
            validationQueryTimeout = 3
            validationInterval = 15000
            testOnBorrow = true
            testWhileIdle = true
            testOnReturn = false
            jdbcInterceptors = 'ConnectionState'
            defaultTransactionIsolation = 2 //# TRANSACTION_READ_COMMITTED
        }
    }
}