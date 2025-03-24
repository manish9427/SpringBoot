# How to add this in repository
- create repo
- git init 
- git add .
- git commit -m "new"
- git remote add origin repo
- git remote -v
- git push origin master
- git pull origin master
  

# How to Connect H2 Database

Open  in Browser
http://localhost:8080/h2-console
Jdbc:h2:mem:testdb
—----------------------------------------------------------------
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Anotation
- @RestController
- @Service
- @RequestBody
- @RequestMapping
- @GetMapping
- @PostMapping 
- @DeleteMapping
- @PutMapping
- @PathVariable
# Beans 
- @Component
- @Autowired
# MongoDB
- net start/stop MongoDB
- show dbs
- use name
- show collections
- db.students.inserOne({})
- db.students.find()
- db.students.find().pretty()
# Walk Through MongoDB 

