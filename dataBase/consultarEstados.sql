SELECT * FROM estados;

SELECT 
    nome, 
    sigla 
FROM estados
WHERE regiao = 'Sul';

SELECT 
    nome,
    regiao,
    populacao 
FROM estados
WHERE populacao >= 10
ORDER BY populacao DESC