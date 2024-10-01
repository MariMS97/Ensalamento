Escreva um programa em Java, utilizando orientação a objetos, para realizar a alocação de estudantes em turmas de uma instituição de ensino. Obs: estou chamando erroneamente essa operação de "ensalamento" por falta de termo melhor.

Nesta instituição, esse cenário é visto da seguinte forma:

alunos e professores possuem algumas características em comum, no momento, destacamos apenas o "nome" (outros atributos serão incluídos nas próximas versões). Em outras palavras, aluno é uma pessoa e professor é uma pessoa;
um professor tem a disciplina na qual ele é titular para ministrá-la;
aluno é vinculado ao curso no qual ele está matriculado;
um curso possui uma ou mais disciplinas associadas a ele;
uma turma é a alocação de todos esses recursos e é feita pelo ensalamento:
turma possui um professor;
turma possui uma disciplina;
turma possui um ou mais alunos matriculados.
O programa deve:
1- ter uma classe para cada conceito descrito no cenário acima;
2- os dados devem ser fixos no código-fonte (hard-coded) conforme listagem abaixo (obs: adotamos essa estratégia para facilitar a implementação do programa);
3- a execução do ensalamento deve ser realizada por um método na classe Ensalamento;
4- o método main deve apenas acionar a execução do ensalamento;
5- o resultado do ensalamento deve ser apresentado para o resultado para o usuário.

Dados fornecidos:

Alunos
Alfredo - TI
Amélia - TI
Ana - ADM
Bruno - TI
Bentinho - ADM
Capitú - TI
Debra - TI
Ian - ADM
Iracema - TI
Joelmir - ADM
Julieta - TI
Luana - ADM
Luciana - TI
Majô - ADM
Maria - ADM
Norberto - TI
Paulo - ADM
Romeu - ADM
Wendel - TI
Zoey - TI
Professores
Mia - POO
Saulo - Estrutura de Dados
Paula - BI
Cursos
TI
ADM
Disciplinas
POO do curso de TI
Estrutura de Dados do curso de TI
BI do curso de ADM
Dicas:

utilize classes e interfaces do framework Collections para agrupamento de objetos;
separe as responsabilidades da execução de cada parte para a classe que possua os dados necessários para executar a operação.

Classes:
Pessoa: classe base para Aluno e Professor.
Aluno: possui um nome e está vinculado a um curso.
Professor: possui um nome e está vinculado a uma disciplina.
Curso: contém o nome do curso e uma lista de disciplinas.
Disciplina: vinculada a um curso.
Turma: composta por um professor, uma disciplina e uma lista de alunos.
Ensalamento: responsável por alocar alunos em turmas e exibir o resultado
