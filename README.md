# Projeto em Java + JPA Spring Boot

Projeto em Java, utilizando as seguintes plataformas: H2, Postman, JPA, SpringBoot.

Objetivo do projeto: montar sistema de uma loja, com entidades Produto, Cliente, Pedido, Item de Pedido, Categoria, entre outras entidades.
Descrição do projeto: 

- Um cliente pode fazer vários pedidos, e todo pedido deve estar vinculado a um usuário.
- O pedido pode ou não ser pago no momento em que é feito.
- A entidade "pedido" pode ter vários status, são eles: AGUARDANDO PAGAMENTO, PAGO, ENVIADO, ENTREGUE, CANCELADO.
- A entidade "pagamento" sempre deve estar vinculada a um pedido.
- Em um pedido, pode ter vários itens de pedido, em que cada item estará relacionado com um produto, além de especificar a quantidade do mesmo.
- Um produto pode ter mais de uma categoria.
- Uma categoria pode ter vários produtos.

Modelo de Classe de Projeto:
![image](https://github.com/joaopdorea/workshop-springboot-jpa/assets/84815558/fe49c654-37f4-47b3-b841-9cb67a0bf1a7)

Modelo de Classe, seguindo a Programação Orientada a Objeto:
![image](https://github.com/joaopdorea/workshop-springboot-jpa/assets/84815558/64769803-2037-4882-a91a-b373f8f33ea5)


Lógica de Implementação do Banco de Dados Relacional:
![image](https://github.com/joaopdorea/workshop-springboot-jpa/assets/84815558/2c55b56d-1e92-49f3-a32f-393b174ec5fe)








