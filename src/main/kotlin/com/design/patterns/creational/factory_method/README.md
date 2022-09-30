# Factory Method

### Objetivo

O Factory Method é um padrão criacional de projeto que fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados.

### Exemplo

No exemplo, temos uma interface Phone com os métodos `call` e `getOS` que é implementada pelas classes IPhone, Samsung e Motorola.

E a interface PhoneFactory que possui o método `factory` e é implementada pela classe PhoneFactoryImpl.

A ideia é que a fabrica gere um produto conforme o tipo de telefone, recebendo o tipo por parâmetro e retornando uma implementação de Phone de acordo com o tipo recebido.


![factory_method](https://user-images.githubusercontent.com/20916334/193330235-8e7b5c94-b1c9-4712-8510-8c5d9ea745f0.jpg)
