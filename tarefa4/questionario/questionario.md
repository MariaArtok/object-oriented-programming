# Herança
> Maria Eduarda Silva da Silva, Engenharia da Computação 2024

1. Herança em Programação Orientada a Objetos (POO) é uma técnica que permite que uma classe, conhecida como subclasse, herde atributos e métodos de outra classe, chamada de superclasse. O principal objetivo dessa abordagem é facilitar a reutilização de código e organizar as hierarquias de classes, o que ajuda a evitar repetições e torna a manutenção mais fácil. Por exemplo, uma classe "Cachorro" pode herdar de uma classe mais geral, como "Animal", e assim aproveitar comportamentos comuns, como "comer" ou "dormir".

2. Uma superclasse é uma classe mais genérica que fornece atributos e métodos para outras classes. Exemplo: Veiculo (com atributos como modelo e ano). Uma subclasse herda características da superclasse e pode adicionar ou modificar comportamentos, adicionando especificidades ao objeto. Exemplo: Carro (herda de Veiculo e adiciona numPistoes).

3. Essa afirmação quer dizer que Estudante é uma espécie de Pessoa. Ou seja, ele herda os atributos e métodos de Pessoa, mas também pode ter características próprias, como matrícula ou o curso em que está matriculado. Por outro lado, Pessoa é um conceito mais geral e pode representar outros tipos, como Professor ou Funcionário, que não possuem as mesmas propriedades específicas de Estudante.

4.  Um dos principais benefícios é a reutilização de código, já que as classes filhas herdam características das classes pai, evitando repetição. Além disso ela ajuda a criar uma estrutura lógica, organizando as classes em hierarquias que fazem sentido no mundo real, como uma classe "Cachorro" que herda de "Animal". Outra vantagem importante é a facilidade de manutenção, pois mudanças feitas na classe principal automaticamente se aplicam às classes que herdam dela. 
A subclasse não acessa os atributos na superclasse por questão de segurança. Utilizando protected ao invés de private permite que as subclasses tenham acesso aos atributos da superclasse.

5. O símbolo utilizado para representar herança é a seta triangular não preenchida, que sai da subclasse para a superclasse.

6. Em Java, a palavra-chave super serve para referenciar elementos da superclassa partir de uma classe subclasse. Um uso comum é dentro do construtor da subclasse, onde super() chama o construtor da superclasse e deve ser a primeira instrução. Outra situação é quando é preciso acessar um método da superclasse que foi sobrescrito na subclasse - usando super.metodo() conseguimos chamar especificamente a versão original do método. 

7. Primeiramente a centralização evita duplicação de código nas subclasses ProfHorista e ProfDE, facilita a manutenção, pois alterações nos atributos compartilhados (como nome ou matricula) precisam ser feitas apenas na superclasse, refletindo automaticamente nas subclasses. 