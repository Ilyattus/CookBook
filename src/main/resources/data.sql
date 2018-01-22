INSERT INTO PERSONS (ID, NAME)
    VALUES
    (1, 'Vasya'),
    (2, 'Petya'),
    (3, 'Tommy Wiseau');


INSERT INTO RECIPES (ID, TITLE, PERSON_ID, INGR, DESCRIPTION)
    VALUES
--    (1, 'Котлетка с макарошками', 1),
--    (2, 'Котлетка с пюрешкой', 2);
--    (1, 'Котлетка с макарошками', 'aaa', 1),
--    (2, 'Котлетка с пюрешкой', 'bbb', 2);
    (1, 'Котлетка с макарошками', 1, 'котлетка, макарошки', 'do it'),
    (2, 'Котлетка с пюрешкой', 2, 'котлетка, картошка', 'JUST');

INSERT INTO COMMENTS (ID, RECIPE_ID, COM_AUTHOR_ID,TEXT)
    VALUES
    (1, 1, 2, 'good'),
    (2, 2, 3, 'not good');


INSERT INTO ROLES(ID, ROLE)
    VALUES
    (1, 'ADMIN'),
    (2, 'USER');


INSERT INTO USERS(ID, USERNAME, PASSWORD)
    VALUES
    (1, 'user1', '$2a$11$rt8ABmnJSR.Cy5d33bDouuCdm9ESpYdMyh.ClIpJsE1MoZJHM7Tou');


INSERT INTO USER_ROLE(USER_ID, ROLE_ID)
    VALUES
    (1, 1);