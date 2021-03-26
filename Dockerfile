FROM openjdk:8

WORKDIR /arcos/bin

ENV PORT 6000

COPY /target/classes /arcos/bin/classes
COPY /target/dependency /arcos/bin/dependency

CMD ["java","-cp","./classes:./dependency/*","co.edu.escuelaing.arep.parcial2.SparkCalculatorAcos"]