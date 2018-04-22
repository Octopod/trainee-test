Använd den här filen för att skriva din code review.

Du kommer att få möjlighet att presentera den även direkt till oss.


* Koden hanterar nu inte specifikt om man försöker köra pop() på en tom stack, man får en ArrayIndexOutOfBoundsException.
Rekommenderar att lägga in en specifik exception. Ex. EmptyStackException().


* Det saknas en metod som kan kolla om stacken är tom, en användbar metod som känns som en basmetod i en stack.
Används exempelvis med fördel i exemplet jag nämnde ovan där man kör pop() på en tom stack.


* contains() behöver modifieras. o är en Optional och antar antingen värdet vi letar efter eller Optional.empty.
Uttrycket blir därför aldrig null och metoden returnerar därför aldrig false.


* access() ärver problematiken från pop()


* Användning av generiska typer istället för objects skulle tillåta användaren att definiera vilken typ av data stacken ska hantera.


Allmänt:
En stack följer Last-In-First-Out principen.
En stack känner endast till den senast tillagda noden/datan och alla interaktioner bör utgå från den principen.
Jag skulle spontant utgå från en LinkedList eller Array, som redan håller koll på pointers.

