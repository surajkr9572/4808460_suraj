# Compiler
CC = gcc

# Executable name
TARGET = all.out

# Source files
SRCS = main.c sum.c sub.c mul.c div.c

# Object files
OBJS = $(SRCS:.c=.o)

# Default target
all: $(TARGET)

# Link object files to create executable
$(TARGET): $(OBJS)
	$(CC) $(OBJS) -o $(TARGET)

# Compile each .c file into .o
%.o: %.c demo.h
	$(CC) -c $< -o $@

# Clean up build files
clean:
	del /Q *.o *.exe $(TARGET) 2>nul || rm -f *.o $(TARGET)
