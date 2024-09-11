using System;
class FibonacciNacci{
    // função verificadora
    static bool Fibonacci(int num){
        
        /*é criado os inteiros A e B com valores iniciais 0 e 1 respectivamente, pois são os valores iniciais
         da sequencia de fibonacci. o laço de repetição garante o cálculo da sequência até que o valor A (o próximo
         número da sequência) seja >= ao número verificador NUM. cada volta do loop armazena o valor atual do A no
         inteiro temporário TEMP. depois, transfere o valor de A para B (que é o próximo número). e por fim
         atualiza o valor de B para a soma do valor antigo de A (que é o TEMP) com o valor atual de A (próprio A).
        */
        int a=0, b=1;
        while (a < num){
            int temp = a;
            a = b;
            b = temp + a;
        }
        //irá retornar apenas quando o valor de A for igual ao valor do número verificador NUM
        return a == num;
    }
    static void Main()
    {
        //obtém o número escolhido
        Console.Write("Digite seu número: ");
        int num = int.Parse(Console.ReadLine());

        //mostra se é ou não fibonacci
        if (Fibonacci(num)){
            Console.WriteLine($"O número {num} faz parte da sequência Fibonacci.");
        }else{
            Console.WriteLine($"O número {num} não faz parte da sequência Fibonacci.");
        }
    }
}
