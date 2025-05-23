Views AULA

HTML, XML, JSON.

Sistemas de tags, locais app/views

? = quando não tem certeza se o resultado pode ser nulo.

<h1>Cliente: ${client?.nome}</h1> - nesse exemplo é usado o ? para evitar que a pagina não carregue,
ou para evitar do uso de if no controlador.

usar o @{controlador.action} - possibilita passar parâmetros para o action e deixar mais limpo o código

@@ - mandar o link via email (recuperação de senha, por ecemplo), coisa para o final da disciplina

Mensagens &{...} - internacionalização dos textos, não vai ser muito utilizado

*{comentario}*

Tags #{tagName /}

Condicionais: 

#{if condição}
...
#{/if}
#{elseif condição}
...
#{/elseif}
#{else condição}
...
#{/else}

Models AULA - adicionar condições no model, garante uma visão mais geral da condição para o programa

db=mem (em memoria)
db=fs (em arquivo, gera arquivo salvando os dados)

usando banco mysql
db.url=jdbc:mysql://localhost/teste
db.driver=com.mysql.jdbc.Driver
db.user=root
db.pass=

MAPEAMENTO OBJETO RELACIONAL
ORM faz um a relaçao de onde vai os dados no banco, sem precisar criar uma tabela e dizer onde vai cada dado.

@Entity - findall() olha todos os dados persistidos nos atributos do modelo

O find so funciona pelo extends Model
Product.find("price > ?1" , 50).fetch(); - ?1 : parametro de preço 50 .fetch(): pegar uma coleção de produtos

modelos genéricos: public class Post extends GenericModel{
@Id 
public Integer id;
}

find.All();
all.fetch(); - serve para limitar : all.fetch(100);

a partir de até: .all().from(50).fetch(100);

post.find("byTittleLike", "%hello%").fetch(); like - parte de algo ou se parece
Post.find("byAuthorisNull").fetch; 

Editar e busca personalizada: controle de transação
