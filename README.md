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
