CREATE TABLE category(
    id BIGINT PRIMARY KEY ,
    name VARCHAR(255),
    parent_id BIGINT NULL,
    FOREIGN KEY (parent_id) REFERENCES  category(id)
);

WITH RECURSIVE CategoryTree AS (SELECT *
                                FROM category
                                WHERE id = ?
                                UNION ALL
                                SELECT c.*
                                FROM category c
                                         INNER JOIN CategoryTree ct ON ct.id = c.parent_id)

)
SELECT * FROM CategoryTree;