JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	Drink.java \
	VendingMachine.java \
	VendingMachineApp.java \

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
