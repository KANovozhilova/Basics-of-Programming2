CREATE TABLE students(
    id              BIGSERIAL PRIMARY KEY,
    first_name      VARCHAR(10) NOT NULL,
    last_name       VARCHAR(15) NOT NULL,
    age             INT NOT NULL
);

INSERT INTO students (first_name, last_name, age) VALUES
('Иван', 'Иванов', 18),
('Семён', 'Семёнов', 19),
('Пётр', 'Петров', 20),
('Николай', 'Николаев', 21),
('Михаил', 'Михайлов', 22);