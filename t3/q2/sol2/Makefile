JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	Point.java \
	Circle.java \
	Test.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
