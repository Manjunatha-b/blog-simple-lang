# Simple custom language with ANTLR and Go

This is a simple custom language to evaluate basic arithmetic expressions.
It only supports numbers.

Make sure you have Java (21) & Go (1.22) installed on your system.<br/>
Fork the repo <br/>
To build:

```bash
./build.sh
```

If you have problems with ownership run chmod +x ./build.sh

Edit the expression in main.go to test out different ones.

To run the program:

```bash
go run main.go
```

> Note: ANTLR jar was downloaded from the main source, and its license is present in ANTLR-license.txt
