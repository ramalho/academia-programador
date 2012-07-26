SELECT * FROM produtos WHERE id = 79 or id = 83

SELECT * FROM produtos WHERE id in (79, 83)

SELECT * FROM itenspedidos ip, pedidos p 
WHERE p.id = 5 
  AND p.id = ip.idPedido
  
SELECT * FROM itenspedidos, pedidos 
WHERE pedidos.id = 5 
  AND pedidos.id = itenspedidos.idPedido
  
SELECT * FROM itenspedidos, pedidos, clientes, produtos 
WHERE pedidos.id = 5 
  AND pedidos.id = itenspedidos.idPedido
  AND pedidos.idCliente = clientes.id
  AND itenspedidos.idProduto = produtos.id

SELECT * FROM pedidos WHERE idCliente = 2

SELECT count(*) FROM pedidos WHERE idCliente = 2
