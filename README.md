# README
![CI](https://github.com/VHWatanabe/devcalc-api/actions/workflows/ci.yml/badge.svg)

## Objetivo
Este projeto é uma API Java para realizar cálculos matemáticos básicos, servindo como base para o aprendizado de Java com Maven.

## Ferramenta de Build
Este projeto utiliza o Apache Maven como ferramenta de build.

## Como executar localmente
1. Clone o repositório:
```bash
git clone https://github.com/VHWatanabe/devcalc-api.git
```
## Registro de Depuração (Exercício 5 - TP2)

Durante os testes com o GitHub Actions, foi introduzido intencionalmente um erro no step de testes com o comando `exit 1`.
A falha foi detectada acessando a aba Actions no GitHub, analisando os logs detalhados do job `test`, onde foi exibido o código de erro e a saída do terminal.
Após identificar a linha que causava o problema, o erro foi corrigido substituindo `exit 1` pelo comando correto `mvn test`, e um novo push foi feito para confirmar a execução bem-sucedida do pipeline.

## Observações sobre modos de execução (Exercício 6 - TP2)

O workflow foi executado de duas maneiras distintas: automaticamente via `push` e manualmente pela interface do GitHub (botão **Run workflow**).
A execução automática ocorre sempre que há alterações nas branches ou nos caminhos definidos nos gatilhos.
Já a execução manual, ativada pelo `workflow_dispatch`, permite controlar a execução sob demanda, com possibilidade de escolher parâmetros como `run_tests` e `run_lint`.
Isso oferece flexibilidade para validar alterações específicas sem depender de commits, sendo útil para testes pontuais ou revisões.
