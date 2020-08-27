/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.codeInsight.surroundWith;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.jetbrains.kotlin.test.TestRoot;
import org.junit.runner.RunWith;

/*
 * This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}.
 * DO NOT MODIFY MANUALLY.
 */
@SuppressWarnings("all")
@TestRoot("idea")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class SurroundWithTestGenerated extends AbstractSurroundWithTest {
    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/codeInsight/surroundWith/if")
    public static class If extends AbstractSurroundWithTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithIfSurrounder, this, testDataFilePath);
        }

        @TestMetadata("block.kt")
        public void testBlock() throws Exception {
            runTest("testData/codeInsight/surroundWith/if/block.kt");
        }

        @TestMetadata("emptyLine.kt")
        public void testEmptyLine() throws Exception {
            runTest("testData/codeInsight/surroundWith/if/emptyLine.kt");
        }

        @TestMetadata("severalStatements.kt")
        public void testSeveralStatements() throws Exception {
            runTest("testData/codeInsight/surroundWith/if/severalStatements.kt");
        }

        @TestMetadata("singleStatement.kt")
        public void testSingleStatement() throws Exception {
            runTest("testData/codeInsight/surroundWith/if/singleStatement.kt");
        }

        @TestMetadata("singleStatementAtCaret.kt")
        public void testSingleStatementAtCaret() throws Exception {
            runTest("testData/codeInsight/surroundWith/if/singleStatementAtCaret.kt");
        }

        @TestMetadata("usedAsExpression.kt")
        public void testUsedAsExpression() throws Exception {
            runTest("testData/codeInsight/surroundWith/if/usedAsExpression.kt");
        }

        @TestMetadata("variable.kt")
        public void testVariable() throws Exception {
            runTest("testData/codeInsight/surroundWith/if/variable.kt");
        }

        @RunWith(JUnit3RunnerWithInners.class)
        @TestMetadata("testData/codeInsight/surroundWith/if/moveDeclarationsOut")
        public abstract static class MoveDeclarationsOut extends AbstractSurroundWithTest {
            @RunWith(JUnit3RunnerWithInners.class)
            @TestMetadata("testData/codeInsight/surroundWith/if/moveDeclarationsOut/class")
            public static class Class extends AbstractSurroundWithTest {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTest(this::doTestWithIfSurrounder, this, testDataFilePath);
                }

                @TestMetadata("classInType.kt")
                public void testClassInType() throws Exception {
                    runTest("testData/codeInsight/surroundWith/if/moveDeclarationsOut/class/classInType.kt");
                }

                @TestMetadata("localClass.kt")
                public void testLocalClass() throws Exception {
                    runTest("testData/codeInsight/surroundWith/if/moveDeclarationsOut/class/localClass.kt");
                }
            }

            @RunWith(JUnit3RunnerWithInners.class)
            @TestMetadata("testData/codeInsight/surroundWith/if/moveDeclarationsOut/function")
            public static class Function extends AbstractSurroundWithTest {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTest(this::doTestWithIfSurrounder, this, testDataFilePath);
                }

                @TestMetadata("firstChildLocalFun.kt")
                public void testFirstChildLocalFun() throws Exception {
                    runTest("testData/codeInsight/surroundWith/if/moveDeclarationsOut/function/firstChildLocalFun.kt");
                }

                @TestMetadata("localFun.kt")
                public void testLocalFun() throws Exception {
                    runTest("testData/codeInsight/surroundWith/if/moveDeclarationsOut/function/localFun.kt");
                }

                @TestMetadata("unusedLocalFun.kt")
                public void testUnusedLocalFun() throws Exception {
                    runTest("testData/codeInsight/surroundWith/if/moveDeclarationsOut/function/unusedLocalFun.kt");
                }
            }

            @RunWith(JUnit3RunnerWithInners.class)
            @TestMetadata("testData/codeInsight/surroundWith/if/moveDeclarationsOut/object")
            public static class Object extends AbstractSurroundWithTest {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTest(this::doTestWithIfSurrounder, this, testDataFilePath);
                }

                @TestMetadata("localObject.kt")
                public void testLocalObject() throws Exception {
                    runTest("testData/codeInsight/surroundWith/if/moveDeclarationsOut/object/localObject.kt");
                }
            }

            @RunWith(JUnit3RunnerWithInners.class)
            @TestMetadata("testData/codeInsight/surroundWith/if/moveDeclarationsOut/order")
            public static class Order extends AbstractSurroundWithTest {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTest(this::doTestWithIfSurrounder, this, testDataFilePath);
                }

                @TestMetadata("twoClasses.kt")
                public void testTwoClasses() throws Exception {
                    runTest("testData/codeInsight/surroundWith/if/moveDeclarationsOut/order/twoClasses.kt");
                }

                @TestMetadata("valAndClass.kt")
                public void testValAndClass() throws Exception {
                    runTest("testData/codeInsight/surroundWith/if/moveDeclarationsOut/order/valAndClass.kt");
                }

                @TestMetadata("valOrder.kt")
                public void testValOrder() throws Exception {
                    runTest("testData/codeInsight/surroundWith/if/moveDeclarationsOut/order/valOrder.kt");
                }
            }

            @RunWith(JUnit3RunnerWithInners.class)
            @TestMetadata("testData/codeInsight/surroundWith/if/moveDeclarationsOut/val")
            public static class Val extends AbstractSurroundWithTest {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTest(this::doTestWithIfSurrounder, this, testDataFilePath);
                }

                @TestMetadata("fullQualifiedType.kt")
                public void testFullQualifiedType() throws Exception {
                    runTest("testData/codeInsight/surroundWith/if/moveDeclarationsOut/val/fullQualifiedType.kt");
                }

                @TestMetadata("fullQualifiedTypeWithoutTypeRef.kt")
                public void testFullQualifiedTypeWithoutTypeRef() throws Exception {
                    runTest("testData/codeInsight/surroundWith/if/moveDeclarationsOut/val/fullQualifiedTypeWithoutTypeRef.kt");
                }

                @TestMetadata("valWithTypeWithInitializer.kt")
                public void testValWithTypeWithInitializer() throws Exception {
                    runTest("testData/codeInsight/surroundWith/if/moveDeclarationsOut/val/valWithTypeWithInitializer.kt");
                }

                @TestMetadata("valWithTypeWoInitializer.kt")
                public void testValWithTypeWoInitializer() throws Exception {
                    runTest("testData/codeInsight/surroundWith/if/moveDeclarationsOut/val/valWithTypeWoInitializer.kt");
                }

                @TestMetadata("valWoTypeWithInitializer.kt")
                public void testValWoTypeWithInitializer() throws Exception {
                    runTest("testData/codeInsight/surroundWith/if/moveDeclarationsOut/val/valWoTypeWithInitializer.kt");
                }
            }

            @RunWith(JUnit3RunnerWithInners.class)
            @TestMetadata("testData/codeInsight/surroundWith/if/moveDeclarationsOut/var")
            public static class Var extends AbstractSurroundWithTest {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTest(this::doTestWithIfSurrounder, this, testDataFilePath);
                }

                @TestMetadata("varWithNotNullableTypeWithInitializer.kt")
                public void testVarWithNotNullableTypeWithInitializer() throws Exception {
                    runTest("testData/codeInsight/surroundWith/if/moveDeclarationsOut/var/varWithNotNullableTypeWithInitializer.kt");
                }

                @TestMetadata("varWithTypeWoInitializer.kt")
                public void testVarWithTypeWoInitializer() throws Exception {
                    runTest("testData/codeInsight/surroundWith/if/moveDeclarationsOut/var/varWithTypeWoInitializer.kt");
                }

                @TestMetadata("varWoTypeWithInitializer.kt")
                public void testVarWoTypeWithInitializer() throws Exception {
                    runTest("testData/codeInsight/surroundWith/if/moveDeclarationsOut/var/varWoTypeWithInitializer.kt");
                }

                @RunWith(JUnit3RunnerWithInners.class)
                @TestMetadata("testData/codeInsight/surroundWith/if/moveDeclarationsOut/var/defaultValue")
                public static class DefaultValue extends AbstractSurroundWithTest {
                    private void runTest(String testDataFilePath) throws Exception {
                        KotlinTestUtils.runTest(this::doTestWithIfSurrounder, this, testDataFilePath);
                    }

                    @TestMetadata("boolean.kt")
                    public void testBoolean() throws Exception {
                        runTest("testData/codeInsight/surroundWith/if/moveDeclarationsOut/var/defaultValue/boolean.kt");
                    }

                    @TestMetadata("nullable.kt")
                    public void testNullable() throws Exception {
                        runTest("testData/codeInsight/surroundWith/if/moveDeclarationsOut/var/defaultValue/nullable.kt");
                    }

                    @TestMetadata("primitiveNumbers.kt")
                    public void testPrimitiveNumbers() throws Exception {
                        runTest("testData/codeInsight/surroundWith/if/moveDeclarationsOut/var/defaultValue/primitiveNumbers.kt");
                    }
                }
            }
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/codeInsight/surroundWith/ifElse")
    public static class IfElse extends AbstractSurroundWithTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithIfElseSurrounder, this, testDataFilePath);
        }

        @TestMetadata("block.kt")
        public void testBlock() throws Exception {
            runTest("testData/codeInsight/surroundWith/ifElse/block.kt");
        }

        @TestMetadata("moveDeclarationsOutVal.kt")
        public void testMoveDeclarationsOutVal() throws Exception {
            runTest("testData/codeInsight/surroundWith/ifElse/moveDeclarationsOutVal.kt");
        }

        @TestMetadata("moveDeclarationsOutVar.kt")
        public void testMoveDeclarationsOutVar() throws Exception {
            runTest("testData/codeInsight/surroundWith/ifElse/moveDeclarationsOutVar.kt");
        }

        @TestMetadata("severalStatements.kt")
        public void testSeveralStatements() throws Exception {
            runTest("testData/codeInsight/surroundWith/ifElse/severalStatements.kt");
        }

        @TestMetadata("singleStatement.kt")
        public void testSingleStatement() throws Exception {
            runTest("testData/codeInsight/surroundWith/ifElse/singleStatement.kt");
        }

        @TestMetadata("singleStatementAtCaret.kt")
        public void testSingleStatementAtCaret() throws Exception {
            runTest("testData/codeInsight/surroundWith/ifElse/singleStatementAtCaret.kt");
        }

        @TestMetadata("usedAsExpression.kt")
        public void testUsedAsExpression() throws Exception {
            runTest("testData/codeInsight/surroundWith/ifElse/usedAsExpression.kt");
        }

        @TestMetadata("variable.kt")
        public void testVariable() throws Exception {
            runTest("testData/codeInsight/surroundWith/ifElse/variable.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/codeInsight/surroundWith/ifElseExpression")
    public static class IfElseExpression extends AbstractSurroundWithTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithIfElseExpressionSurrounder, this, testDataFilePath);
        }

        @TestMetadata("asStatement.kt")
        public void testAsStatement() throws Exception {
            runTest("testData/codeInsight/surroundWith/ifElseExpression/asStatement.kt");
        }

        @TestMetadata("paranthesized.kt")
        public void testParanthesized() throws Exception {
            runTest("testData/codeInsight/surroundWith/ifElseExpression/paranthesized.kt");
        }

        @TestMetadata("singleExpression.kt")
        public void testSingleExpression() throws Exception {
            runTest("testData/codeInsight/surroundWith/ifElseExpression/singleExpression.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/codeInsight/surroundWith/ifElseExpressionBraces")
    public static class IfElseExpressionBraces extends AbstractSurroundWithTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithIfElseExpressionBracesSurrounder, this, testDataFilePath);
        }

        @TestMetadata("asStatement.kt")
        public void testAsStatement() throws Exception {
            runTest("testData/codeInsight/surroundWith/ifElseExpressionBraces/asStatement.kt");
        }

        @TestMetadata("singleExpression.kt")
        public void testSingleExpression() throws Exception {
            runTest("testData/codeInsight/surroundWith/ifElseExpressionBraces/singleExpression.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/codeInsight/surroundWith/not")
    public static class Not extends AbstractSurroundWithTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithNotSurrounder, this, testDataFilePath);
        }

        @TestMetadata("booleanExpr.kt")
        public void testBooleanExpr() throws Exception {
            runTest("testData/codeInsight/surroundWith/not/booleanExpr.kt");
        }

        @TestMetadata("booleanExprAtCaret.kt")
        public void testBooleanExprAtCaret() throws Exception {
            runTest("testData/codeInsight/surroundWith/not/booleanExprAtCaret.kt");
        }

        @TestMetadata("expressionInIf.kt")
        public void testExpressionInIf() throws Exception {
            runTest("testData/codeInsight/surroundWith/not/expressionInIf.kt");
        }

        @TestMetadata("notExpression.kt")
        public void testNotExpression() throws Exception {
            runTest("testData/codeInsight/surroundWith/not/notExpression.kt");
        }

        @TestMetadata("severalExpr.kt")
        public void testSeveralExpr() throws Exception {
            runTest("testData/codeInsight/surroundWith/not/severalExpr.kt");
        }

        @TestMetadata("severalExprAtCaret.kt")
        public void testSeveralExprAtCaret() throws Exception {
            runTest("testData/codeInsight/surroundWith/not/severalExprAtCaret.kt");
        }

        @TestMetadata("variable.kt")
        public void testVariable() throws Exception {
            runTest("testData/codeInsight/surroundWith/not/variable.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/codeInsight/surroundWith/parentheses")
    public static class Parentheses extends AbstractSurroundWithTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithParenthesesSurrounder, this, testDataFilePath);
        }

        @TestMetadata("expr.kt")
        public void testExpr() throws Exception {
            runTest("testData/codeInsight/surroundWith/parentheses/expr.kt");
        }

        @TestMetadata("inIf.kt")
        public void testInIf() throws Exception {
            runTest("testData/codeInsight/surroundWith/parentheses/inIf.kt");
        }

        @TestMetadata("partOfExpr.kt")
        public void testPartOfExpr() throws Exception {
            runTest("testData/codeInsight/surroundWith/parentheses/partOfExpr.kt");
        }

        @RunWith(JUnit3RunnerWithInners.class)
        @TestMetadata("testData/codeInsight/surroundWith/parentheses/notApplicable")
        public static class NotApplicable extends AbstractSurroundWithTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTestWithParenthesesSurrounder, this, testDataFilePath);
            }

            @TestMetadata("if.kt")
            public void testIf() throws Exception {
                runTest("testData/codeInsight/surroundWith/parentheses/notApplicable/if.kt");
            }

            @TestMetadata("import.kt")
            public void testImport() throws Exception {
                runTest("testData/codeInsight/surroundWith/parentheses/notApplicable/import.kt");
            }

            @TestMetadata("importQualifiedFirst.kt")
            public void testImportQualifiedFirst() throws Exception {
                runTest("testData/codeInsight/surroundWith/parentheses/notApplicable/importQualifiedFirst.kt");
            }

            @TestMetadata("importQualifiedSecond.kt")
            public void testImportQualifiedSecond() throws Exception {
                runTest("testData/codeInsight/surroundWith/parentheses/notApplicable/importQualifiedSecond.kt");
            }

            @TestMetadata("packageName.kt")
            public void testPackageName() throws Exception {
                runTest("testData/codeInsight/surroundWith/parentheses/notApplicable/packageName.kt");
            }

            @TestMetadata("parameterName.kt")
            public void testParameterName() throws Exception {
                runTest("testData/codeInsight/surroundWith/parentheses/notApplicable/parameterName.kt");
            }

            @TestMetadata("parameterWithType.kt")
            public void testParameterWithType() throws Exception {
                runTest("testData/codeInsight/surroundWith/parentheses/notApplicable/parameterWithType.kt");
            }

            @TestMetadata("qualifiedExpressionSecond.kt")
            public void testQualifiedExpressionSecond() throws Exception {
                runTest("testData/codeInsight/surroundWith/parentheses/notApplicable/qualifiedExpressionSecond.kt");
            }

            @TestMetadata("qualifiedExpressionSecondWithBracket.kt")
            public void testQualifiedExpressionSecondWithBracket() throws Exception {
                runTest("testData/codeInsight/surroundWith/parentheses/notApplicable/qualifiedExpressionSecondWithBracket.kt");
            }
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/codeInsight/surroundWith/stringTemplate")
    public static class StringTemplate extends AbstractSurroundWithTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithStringTemplateSurrounder, this, testDataFilePath);
        }

        @TestMetadata("multiExpression.kt")
        public void testMultiExpression() throws Exception {
            runTest("testData/codeInsight/surroundWith/stringTemplate/multiExpression.kt");
        }

        @TestMetadata("multiExpressionConstant.kt")
        public void testMultiExpressionConstant() throws Exception {
            runTest("testData/codeInsight/surroundWith/stringTemplate/multiExpressionConstant.kt");
        }

        @TestMetadata("singleConstant.kt")
        public void testSingleConstant() throws Exception {
            runTest("testData/codeInsight/surroundWith/stringTemplate/singleConstant.kt");
        }

        @TestMetadata("singleExpression.kt")
        public void testSingleExpression() throws Exception {
            runTest("testData/codeInsight/surroundWith/stringTemplate/singleExpression.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/codeInsight/surroundWith/when")
    public static class When extends AbstractSurroundWithTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithWhenSurrounder, this, testDataFilePath);
        }

        @TestMetadata("enum.kt")
        public void testEnum() throws Exception {
            runTest("testData/codeInsight/surroundWith/when/enum.kt");
        }

        @TestMetadata("multiExpression.kt")
        public void testMultiExpression() throws Exception {
            runTest("testData/codeInsight/surroundWith/when/multiExpression.kt");
        }

        @TestMetadata("singleExpression.kt")
        public void testSingleExpression() throws Exception {
            runTest("testData/codeInsight/surroundWith/when/singleExpression.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/codeInsight/surroundWith/tryCatch")
    public static class TryCatch extends AbstractSurroundWithTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithTryCatchSurrounder, this, testDataFilePath);
        }

        @TestMetadata("moveDeclarationsOut.kt")
        public void testMoveDeclarationsOut() throws Exception {
            runTest("testData/codeInsight/surroundWith/tryCatch/moveDeclarationsOut.kt");
        }

        @TestMetadata("moveDeclarationsOutSingleStatement.kt")
        public void testMoveDeclarationsOutSingleStatement() throws Exception {
            runTest("testData/codeInsight/surroundWith/tryCatch/moveDeclarationsOutSingleStatement.kt");
        }

        @TestMetadata("multiExpression.kt")
        public void testMultiExpression() throws Exception {
            runTest("testData/codeInsight/surroundWith/tryCatch/multiExpression.kt");
        }

        @TestMetadata("singleExpression.kt")
        public void testSingleExpression() throws Exception {
            runTest("testData/codeInsight/surroundWith/tryCatch/singleExpression.kt");
        }

        @TestMetadata("usedAsExpression.kt")
        public void testUsedAsExpression() throws Exception {
            runTest("testData/codeInsight/surroundWith/tryCatch/usedAsExpression.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/codeInsight/surroundWith/tryCatchExpression")
    public static class TryCatchExpression extends AbstractSurroundWithTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithTryCatchExpressionSurrounder, this, testDataFilePath);
        }

        @TestMetadata("asStatement.kt")
        public void testAsStatement() throws Exception {
            runTest("testData/codeInsight/surroundWith/tryCatchExpression/asStatement.kt");
        }

        @TestMetadata("singleExpression.kt")
        public void testSingleExpression() throws Exception {
            runTest("testData/codeInsight/surroundWith/tryCatchExpression/singleExpression.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/codeInsight/surroundWith/tryCatchFinally")
    public static class TryCatchFinally extends AbstractSurroundWithTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithTryCatchFinallySurrounder, this, testDataFilePath);
        }

        @TestMetadata("multiExpression.kt")
        public void testMultiExpression() throws Exception {
            runTest("testData/codeInsight/surroundWith/tryCatchFinally/multiExpression.kt");
        }

        @TestMetadata("singleExpression.kt")
        public void testSingleExpression() throws Exception {
            runTest("testData/codeInsight/surroundWith/tryCatchFinally/singleExpression.kt");
        }

        @TestMetadata("usedAsExpression.kt")
        public void testUsedAsExpression() throws Exception {
            runTest("testData/codeInsight/surroundWith/tryCatchFinally/usedAsExpression.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/codeInsight/surroundWith/tryCatchFinallyExpression")
    public static class TryCatchFinallyExpression extends AbstractSurroundWithTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithTryCatchFinallyExpressionSurrounder, this, testDataFilePath);
        }

        @TestMetadata("asStatement.kt")
        public void testAsStatement() throws Exception {
            runTest("testData/codeInsight/surroundWith/tryCatchFinallyExpression/asStatement.kt");
        }

        @TestMetadata("singleExpression.kt")
        public void testSingleExpression() throws Exception {
            runTest("testData/codeInsight/surroundWith/tryCatchFinallyExpression/singleExpression.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/codeInsight/surroundWith/tryFinally")
    public static class TryFinally extends AbstractSurroundWithTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithTryFinallySurrounder, this, testDataFilePath);
        }

        @TestMetadata("multiExpression.kt")
        public void testMultiExpression() throws Exception {
            runTest("testData/codeInsight/surroundWith/tryFinally/multiExpression.kt");
        }

        @TestMetadata("singleExpression.kt")
        public void testSingleExpression() throws Exception {
            runTest("testData/codeInsight/surroundWith/tryFinally/singleExpression.kt");
        }

        @TestMetadata("usedAsExpression.kt")
        public void testUsedAsExpression() throws Exception {
            runTest("testData/codeInsight/surroundWith/tryFinally/usedAsExpression.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/codeInsight/surroundWith/functionLiteral")
    public static class FunctionLiteral extends AbstractSurroundWithTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithFunctionLiteralSurrounder, this, testDataFilePath);
        }

        @TestMetadata("moveDeclarationsOut.kt")
        public void testMoveDeclarationsOut() throws Exception {
            runTest("testData/codeInsight/surroundWith/functionLiteral/moveDeclarationsOut.kt");
        }

        @TestMetadata("multiStatement.kt")
        public void testMultiStatement() throws Exception {
            runTest("testData/codeInsight/surroundWith/functionLiteral/multiStatement.kt");
        }

        @TestMetadata("singleStatement.kt")
        public void testSingleStatement() throws Exception {
            runTest("testData/codeInsight/surroundWith/functionLiteral/singleStatement.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/codeInsight/surroundWith/withIfExpression")
    public static class WithIfExpression extends AbstractSurroundWithTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithSurroundWithIfExpression, this, testDataFilePath);
        }

        @TestMetadata("complexBoolean.kt")
        public void testComplexBoolean() throws Exception {
            runTest("testData/codeInsight/surroundWith/withIfExpression/complexBoolean.kt");
        }

        @TestMetadata("variable.kt")
        public void testVariable() throws Exception {
            runTest("testData/codeInsight/surroundWith/withIfExpression/variable.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/codeInsight/surroundWith/withIfElseExpression")
    public static class WithIfElseExpression extends AbstractSurroundWithTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithSurroundWithIfElseExpression, this, testDataFilePath);
        }

        @TestMetadata("complexBoolean.kt")
        public void testComplexBoolean() throws Exception {
            runTest("testData/codeInsight/surroundWith/withIfElseExpression/complexBoolean.kt");
        }

        @TestMetadata("replaceWithParenthesized.kt")
        public void testReplaceWithParenthesized() throws Exception {
            runTest("testData/codeInsight/surroundWith/withIfElseExpression/replaceWithParenthesized.kt");
        }

        @TestMetadata("variable.kt")
        public void testVariable() throws Exception {
            runTest("testData/codeInsight/surroundWith/withIfElseExpression/variable.kt");
        }
    }
}
