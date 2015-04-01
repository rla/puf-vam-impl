# Packages #

  * `tr.fn.ast` - classes of abstract syntax tree. These also contain helper methods such as finding free variables and abstract interpretation.
  * `tr.fn.gen` - code generation (codeB, codeV and codeC).
  * `tr.fn.grammar` - Puf parser. The grammar specification for ANTLR is in the file Puf.g.
  * `tr.fn.opt` - contains classes that implement optimizations that are run before code generations.
  * `tr.fn.post` - classes for processing after code generation.
  * `tr.fn.pre` - classes for processing before code generation. #include statement is implemented here.
  * `tr.fn.test` - the main test package. Uses non-visual mama to run the tests.

# Important classes #