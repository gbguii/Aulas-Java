

ALTER TABLE empresas MODIFY cnpj VARCHAR(14);

INSERT INTO empresas
    (nome, cnpj)
VALUES
    ('Bradesco', 54776922000114),
    ('Vale', 43434409000129),
    ('Cielo', 94604162000182);

SELECT * FROM empresas;
SELECT * FROM cidades;

INSERT INTO empresas_unidades
        (empresa_id, cidade_id, sede)
VALUES
    (1,1,1),
    (1,3,0),
    (2,1,0),
    (2,3,1)
