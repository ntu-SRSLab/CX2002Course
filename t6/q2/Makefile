JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	Bank.java \
	Check.java \
	CheckingAccount.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
