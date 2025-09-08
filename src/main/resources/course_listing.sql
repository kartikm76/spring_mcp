DROP TABLE my_schema.course_listing;

CREATE TABLE my_schema.course_listing (
  Id SERIAL PRIMARY KEY,
  title char(100),
  url CHAR(500)
);

INSERT INTO my_schema.course_listing (title, url) VALUES
('Java', 'https://www.javatpoint.com/java-tutorial');

INSERT INTO my_schema.course_listing (title, url) VALUES
('Spring Boot', 'https://www.javatpoint.com/spring-boot-tutorial');

INSERT INTO my_schema.course_listing (title, url) VALUES
('Java Design Patterns', 'https://www.javatpoint.com/design-patterns-in-java');
