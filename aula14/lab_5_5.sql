select count(*) from clientes;

select pedidos.numero, produtos.nome, produtos.preco 
from pedidos, itenspedidos, produtos 
where itenspedidos.idPedido = pedidos.id 
  and itenspedidos.idProduto = produtos.id 
order by pedidos.numero; -- atividade 3

-- extra: agregacao para calcular o valor dos pedidos;

select pedidos.numero, sum(produtos.preco*itenspedidos.quantidade) 
from pedidos, itenspedidos, produtos 
where itenspedidos.idPedido = pedidos.id 
  and itenspedidos.idProduto = produtos.id 
group by pedidos.numero 
order by pedidos.numero;
