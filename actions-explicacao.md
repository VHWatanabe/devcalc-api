Um workflow no GitHub Actions é um conjunto automatizado de tarefas definido em um arquivo YAML dentro do diretório `.github/workflows/` do repositório.
Ele é responsável por orquestrar a execução de jobs (como build, test, deploy) e pode ser acionado por eventos como `push`, `pull_request` ou manualmente via `workflow_dispatch`.
Já uma action é uma unidade reutilizável de código que realiza uma tarefa específica dentro desses workflows.
As actions podem ser criadas por você mesmo ou reutilizadas da comunidade, e servem como blocos de construção dos workflows.

Uma das actions utilizadas neste projeto foi a `actions/setup-java@v3`, que serve para configurar o ambiente com a versão desejada do Java.
No workflow, ela é chamada através da instrução `uses: actions/setup-java@v3`, e os parâmetros são passados através da chave `with`.
Por exemplo, utilizamos `java-version: '21'` para indicar a versão da JDK, e `distribution: 'temurin'` para definir a distribuição desejada.
Essa action instala a JDK corretamente no runner, permitindo que comandos subsequentes como `mvn clean install` e `mvn test` funcionem com a versão adequada da linguagem.
