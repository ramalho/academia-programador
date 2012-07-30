insert into clientes (nome, cpf, telefone, email) 
values (
  'Luciano Ramalho', 
  '123456789-03', 
  '98888-4444', 
  'lu@tal.com')
  
select * from clientes;  -- 157

update clientes set cpf = '123456789-89' where id=157;

delete from clientes where id=157;


SELECT clientes.nome, pedidos.numero from clientes, pedidos
where clientes.id = pedidos.idCliente;


-- faltou permissao para fazer:

alter table produtos add column preco_usd double;

update produtos set preco_usd = preco/2.04;
