# envio-de-email-com-java

# Pré requisitos

- Java 8+
- Maven 3 ou 5

# instruções essenciais para o funcionamento

Acessar o seguinte caminho **`src\main\resources\env`**  e editar o arquivo **`email.properties`** e editar os seguintes campos:

- email.smtp.useremail=login do gmail que ira enviar os emails (remetente) 
- email.smtp.password=senha do email
- email.smtp.destinatario=email do destinatario

Após essa configurações vá ao seu email remetente e habilite a opção `Apps menos seguros` nas configurações do gmail.

# Executar Projeto

Para executar o projeto agora todo configurado, entre na pasta raiz do projeto e execute

- `mvn clean instal`