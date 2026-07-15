# Tratamento de Exceções em Reservas

## ❌ Solução 1 (Muito Ruim)

**Lógica de validação no programa principal**

* Lógica de validação não delegada à reserva.

---

## ⚠️ Solução 2 (Ruim)

**Método retornando string**

* A semântica da operação é prejudicada.

* Retornar `string` não tem relação com a atualização de reserva.

* Inviabiliza o cenário caso a operação realmente precisasse retornar uma `string`.

* Não é possível tratar exceções em construtores.

* Não há auxílio do compilador (o programador deve se "lembrar" de verificar se houve erro).

* A lógica do código fica estruturada em condicionais aninhadas.

---

##  Solução 3 (Boa)

**Tratamento de exceções**

* Validação e tratamento de erros feitos de forma estruturada e elegante através de exceções.

A lógica do código fica estruturada em condicionais aninhadas.

Solução 3 (Boa)
Tratamento de exceções

Validação e tratamento de erros feitos de forma estruturada e elegante através de exceções.
