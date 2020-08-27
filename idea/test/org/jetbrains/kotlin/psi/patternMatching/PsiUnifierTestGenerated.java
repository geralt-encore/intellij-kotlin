/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.psi.patternMatching;

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
@TestMetadata("testData/unifier")
public abstract class PsiUnifierTestGenerated extends AbstractPsiUnifierTest {
    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/unifier/equivalence")
    public abstract static class Equivalence extends AbstractPsiUnifierTest {
        @RunWith(JUnit3RunnerWithInners.class)
        @TestMetadata("testData/unifier/equivalence/controlStructures")
        public static class ControlStructures extends AbstractPsiUnifierTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
            }

            @TestMetadata("break.kt")
            public void testBreak() throws Exception {
                runTest("testData/unifier/equivalence/controlStructures/break.kt");
            }

            @TestMetadata("continue.kt")
            public void testContinue() throws Exception {
                runTest("testData/unifier/equivalence/controlStructures/continue.kt");
            }

            @TestMetadata("doWhileRuntime.kt")
            public void testDoWhileRuntime() throws Exception {
                runTest("testData/unifier/equivalence/controlStructures/doWhileRuntime.kt");
            }

            @TestMetadata("forRuntime.kt")
            public void testForRuntime() throws Exception {
                runTest("testData/unifier/equivalence/controlStructures/forRuntime.kt");
            }

            @TestMetadata("ifElseRuntime.kt")
            public void testIfElseRuntime() throws Exception {
                runTest("testData/unifier/equivalence/controlStructures/ifElseRuntime.kt");
            }

            @TestMetadata("ifRuntime.kt")
            public void testIfRuntime() throws Exception {
                runTest("testData/unifier/equivalence/controlStructures/ifRuntime.kt");
            }

            @TestMetadata("labeledReturn.kt")
            public void testLabeledReturn() throws Exception {
                runTest("testData/unifier/equivalence/controlStructures/labeledReturn.kt");
            }

            @TestMetadata("throwRuntime.kt")
            public void testThrowRuntime() throws Exception {
                runTest("testData/unifier/equivalence/controlStructures/throwRuntime.kt");
            }

            @TestMetadata("unitReturn.kt")
            public void testUnitReturn() throws Exception {
                runTest("testData/unifier/equivalence/controlStructures/unitReturn.kt");
            }

            @TestMetadata("valuedReturn.kt")
            public void testValuedReturn() throws Exception {
                runTest("testData/unifier/equivalence/controlStructures/valuedReturn.kt");
            }

            @TestMetadata("whenWithSubjectRuntime.kt")
            public void testWhenWithSubjectRuntime() throws Exception {
                runTest("testData/unifier/equivalence/controlStructures/whenWithSubjectRuntime.kt");
            }

            @TestMetadata("whenWithoutSubjectRuntime.kt")
            public void testWhenWithoutSubjectRuntime() throws Exception {
                runTest("testData/unifier/equivalence/controlStructures/whenWithoutSubjectRuntime.kt");
            }

            @TestMetadata("whileRuntime.kt")
            public void testWhileRuntime() throws Exception {
                runTest("testData/unifier/equivalence/controlStructures/whileRuntime.kt");
            }

            @RunWith(JUnit3RunnerWithInners.class)
            @TestMetadata("testData/unifier/equivalence/controlStructures/blocks")
            public static class Blocks extends AbstractPsiUnifierTest {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
                }

                @TestMetadata("anonymousObjectsRuntime.kt")
                public void testAnonymousObjectsRuntime() throws Exception {
                    runTest("testData/unifier/equivalence/controlStructures/blocks/anonymousObjectsRuntime.kt");
                }

                @TestMetadata("localFunctionsRuntime.kt")
                public void testLocalFunctionsRuntime() throws Exception {
                    runTest("testData/unifier/equivalence/controlStructures/blocks/localFunctionsRuntime.kt");
                }

                @TestMetadata("localVarsRuntime.kt")
                public void testLocalVarsRuntime() throws Exception {
                    runTest("testData/unifier/equivalence/controlStructures/blocks/localVarsRuntime.kt");
                }
            }
        }

        @RunWith(JUnit3RunnerWithInners.class)
        @TestMetadata("testData/unifier/equivalence/declarations")
        public abstract static class Declarations extends AbstractPsiUnifierTest {
            @RunWith(JUnit3RunnerWithInners.class)
            @TestMetadata("testData/unifier/equivalence/declarations/classesAndObjects")
            public static class ClassesAndObjects extends AbstractPsiUnifierTest {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
                }

                @TestMetadata("anonymousObjectBody.kt")
                public void testAnonymousObjectBody() throws Exception {
                    runTest("testData/unifier/equivalence/declarations/classesAndObjects/anonymousObjectBody.kt");
                }

                @TestMetadata("delegation.kt")
                public void testDelegation() throws Exception {
                    runTest("testData/unifier/equivalence/declarations/classesAndObjects/delegation.kt");
                }

                @TestMetadata("emptyBody.kt")
                public void testEmptyBody() throws Exception {
                    runTest("testData/unifier/equivalence/declarations/classesAndObjects/emptyBody.kt");
                }

                @TestMetadata("localClassBody.kt")
                public void testLocalClassBody() throws Exception {
                    runTest("testData/unifier/equivalence/declarations/classesAndObjects/localClassBody.kt");
                }

                @TestMetadata("localObjectBody.kt")
                public void testLocalObjectBody() throws Exception {
                    runTest("testData/unifier/equivalence/declarations/classesAndObjects/localObjectBody.kt");
                }

                @TestMetadata("members.kt")
                public void testMembers() throws Exception {
                    runTest("testData/unifier/equivalence/declarations/classesAndObjects/members.kt");
                }
            }

            @RunWith(JUnit3RunnerWithInners.class)
            @TestMetadata("testData/unifier/equivalence/declarations/localCallables")
            public static class LocalCallables extends AbstractPsiUnifierTest {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
                }

                @TestMetadata("localExtensionFunctions.kt")
                public void testLocalExtensionFunctions() throws Exception {
                    runTest("testData/unifier/equivalence/declarations/localCallables/localExtensionFunctions.kt");
                }

                @TestMetadata("localFunctions.kt")
                public void testLocalFunctions() throws Exception {
                    runTest("testData/unifier/equivalence/declarations/localCallables/localFunctions.kt");
                }

                @TestMetadata("localVariables.kt")
                public void testLocalVariables() throws Exception {
                    runTest("testData/unifier/equivalence/declarations/localCallables/localVariables.kt");
                }

                @TestMetadata("multiDeclaration.kt")
                public void testMultiDeclaration() throws Exception {
                    runTest("testData/unifier/equivalence/declarations/localCallables/multiDeclaration.kt");
                }

                @RunWith(JUnit3RunnerWithInners.class)
                @TestMetadata("testData/unifier/equivalence/declarations/localCallables/lambdas")
                public static class Lambdas extends AbstractPsiUnifierTest {
                    private void runTest(String testDataFilePath) throws Exception {
                        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
                    }

                    @TestMetadata("multipleParamsRuntime.kt")
                    public void testMultipleParamsRuntime() throws Exception {
                        runTest("testData/unifier/equivalence/declarations/localCallables/lambdas/multipleParamsRuntime.kt");
                    }

                    @TestMetadata("noParams.kt")
                    public void testNoParams() throws Exception {
                        runTest("testData/unifier/equivalence/declarations/localCallables/lambdas/noParams.kt");
                    }

                    @TestMetadata("receiverArgumentsRuntime.kt")
                    public void testReceiverArgumentsRuntime() throws Exception {
                        runTest("testData/unifier/equivalence/declarations/localCallables/lambdas/receiverArgumentsRuntime.kt");
                    }

                    @TestMetadata("singleParam.kt")
                    public void testSingleParam() throws Exception {
                        runTest("testData/unifier/equivalence/declarations/localCallables/lambdas/singleParam.kt");
                    }

                    @TestMetadata("unitCoercion.kt")
                    public void testUnitCoercion() throws Exception {
                        runTest("testData/unifier/equivalence/declarations/localCallables/lambdas/unitCoercion.kt");
                    }
                }
            }

            @RunWith(JUnit3RunnerWithInners.class)
            @TestMetadata("testData/unifier/equivalence/declarations/typeParameters")
            public static class TypeParameters extends AbstractPsiUnifierTest {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
                }

                @TestMetadata("boundsAndConstraints.kt")
                public void testBoundsAndConstraints() throws Exception {
                    runTest("testData/unifier/equivalence/declarations/typeParameters/boundsAndConstraints.kt");
                }
            }
        }

        @RunWith(JUnit3RunnerWithInners.class)
        @TestMetadata("testData/unifier/equivalence/expressions")
        public static class Expressions extends AbstractPsiUnifierTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
            }

            @TestMetadata("arrayAccess.kt")
            public void testArrayAccess() throws Exception {
                runTest("testData/unifier/equivalence/expressions/arrayAccess.kt");
            }

            @TestMetadata("const.kt")
            public void testConst() throws Exception {
                runTest("testData/unifier/equivalence/expressions/const.kt");
            }

            @TestMetadata("qualifiedName.kt")
            public void testQualifiedName() throws Exception {
                runTest("testData/unifier/equivalence/expressions/qualifiedName.kt");
            }

            @TestMetadata("simpleNameRuntime.kt")
            public void testSimpleNameRuntime() throws Exception {
                runTest("testData/unifier/equivalence/expressions/simpleNameRuntime.kt");
            }

            @TestMetadata("stringTemplate.kt")
            public void testStringTemplate() throws Exception {
                runTest("testData/unifier/equivalence/expressions/stringTemplate.kt");
            }

            @RunWith(JUnit3RunnerWithInners.class)
            @TestMetadata("testData/unifier/equivalence/expressions/callableReferences")
            public static class CallableReferences extends AbstractPsiUnifierTest {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
                }

                @TestMetadata("classRefRuntime.kt")
                public void testClassRefRuntime() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/callableReferences/classRefRuntime.kt");
                }

                @TestMetadata("expressionReceivers.kt")
                public void testExpressionReceivers() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/callableReferences/expressionReceivers.kt");
                }

                @TestMetadata("functionRefRuntime.kt")
                public void testFunctionRefRuntime() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/callableReferences/functionRefRuntime.kt");
                }
            }

            @RunWith(JUnit3RunnerWithInners.class)
            @TestMetadata("testData/unifier/equivalence/expressions/calls")
            public static class Calls extends AbstractPsiUnifierTest {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
                }

                @TestMetadata("callAndCalleeRuntime.kt")
                public void testCallAndCalleeRuntime() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/calls/callAndCalleeRuntime.kt");
                }

                @TestMetadata("callTypeArgumentsRuntime.kt")
                public void testCallTypeArgumentsRuntime() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/calls/callTypeArgumentsRuntime.kt");
                }

                @TestMetadata("callUnderSmartCast.kt")
                public void testCallUnderSmartCast() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/calls/callUnderSmartCast.kt");
                }

                @TestMetadata("externalArgumentsRuntime.kt")
                public void testExternalArgumentsRuntime() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/calls/externalArgumentsRuntime.kt");
                }

                @TestMetadata("extraArguments.kt")
                public void testExtraArguments() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/calls/extraArguments.kt");
                }

                @TestMetadata("implicitReceiverArgument.kt")
                public void testImplicitReceiverArgument() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/calls/implicitReceiverArgument.kt");
                }

                @TestMetadata("implicitThis.kt")
                public void testImplicitThis() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/calls/implicitThis.kt");
                }

                @TestMetadata("safeCall.kt")
                public void testSafeCall() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/calls/safeCall.kt");
                }

                @TestMetadata("unresolved.kt")
                public void testUnresolved() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/calls/unresolved.kt");
                }

                @TestMetadata("varargs.kt")
                public void testVarargs() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/calls/varargs.kt");
                }
            }

            @RunWith(JUnit3RunnerWithInners.class)
            @TestMetadata("testData/unifier/equivalence/expressions/casts")
            public static class Casts extends AbstractPsiUnifierTest {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
                }

                @TestMetadata("as.kt")
                public void testAs() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/casts/as.kt");
                }

                @TestMetadata("is.kt")
                public void testIs() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/casts/is.kt");
                }

                @TestMetadata("safeAs.kt")
                public void testSafeAs() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/casts/safeAs.kt");
                }
            }

            @RunWith(JUnit3RunnerWithInners.class)
            @TestMetadata("testData/unifier/equivalence/expressions/conventions")
            public static class Conventions extends AbstractPsiUnifierTest {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
                }

                @TestMetadata("containsRuntime.kt")
                public void testContainsRuntime() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/conventions/containsRuntime.kt");
                }

                @TestMetadata("equals.kt")
                public void testEquals() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/conventions/equals.kt");
                }

                @TestMetadata("getRuntime.kt")
                public void testGetRuntime() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/conventions/getRuntime.kt");
                }

                @TestMetadata("inc.kt")
                public void testInc() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/conventions/inc.kt");
                }

                @TestMetadata("infixCall.kt")
                public void testInfixCall() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/conventions/infixCall.kt");
                }

                @TestMetadata("lessThan.kt")
                public void testLessThan() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/conventions/lessThan.kt");
                }

                @TestMetadata("notContains.kt")
                public void testNotContains() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/conventions/notContains.kt");
                }

                @TestMetadata("notEquals.kt")
                public void testNotEquals() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/conventions/notEquals.kt");
                }

                @TestMetadata("plus.kt")
                public void testPlus() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/conventions/plus.kt");
                }

                @TestMetadata("unaryMinus.kt")
                public void testUnaryMinus() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/conventions/unaryMinus.kt");
                }

                @RunWith(JUnit3RunnerWithInners.class)
                @TestMetadata("testData/unifier/equivalence/expressions/conventions/assignments")
                public static class Assignments extends AbstractPsiUnifierTest {
                    private void runTest(String testDataFilePath) throws Exception {
                        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
                    }

                    @TestMetadata("indexedPlusAssignRuntime.kt")
                    public void testIndexedPlusAssignRuntime() throws Exception {
                        runTest("testData/unifier/equivalence/expressions/conventions/assignments/indexedPlusAssignRuntime.kt");
                    }

                    @TestMetadata("plusAndAssign.kt")
                    public void testPlusAndAssign() throws Exception {
                        runTest("testData/unifier/equivalence/expressions/conventions/assignments/plusAndAssign.kt");
                    }

                    @TestMetadata("plusAndAssignWithSet.kt")
                    public void testPlusAndAssignWithSet() throws Exception {
                        runTest("testData/unifier/equivalence/expressions/conventions/assignments/plusAndAssignWithSet.kt");
                    }

                    @TestMetadata("plusAssign.kt")
                    public void testPlusAssign() throws Exception {
                        runTest("testData/unifier/equivalence/expressions/conventions/assignments/plusAssign.kt");
                    }

                    @TestMetadata("setRuntime.kt")
                    public void testSetRuntime() throws Exception {
                        runTest("testData/unifier/equivalence/expressions/conventions/assignments/setRuntime.kt");
                    }
                }

                @RunWith(JUnit3RunnerWithInners.class)
                @TestMetadata("testData/unifier/equivalence/expressions/conventions/invoke")
                public static class Invoke extends AbstractPsiUnifierTest {
                    private void runTest(String testDataFilePath) throws Exception {
                        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
                    }

                    @TestMetadata("invokeOnCall.kt")
                    public void testInvokeOnCall() throws Exception {
                        runTest("testData/unifier/equivalence/expressions/conventions/invoke/invokeOnCall.kt");
                    }

                    @TestMetadata("invokeOnConst.kt")
                    public void testInvokeOnConst() throws Exception {
                        runTest("testData/unifier/equivalence/expressions/conventions/invoke/invokeOnConst.kt");
                    }

                    @TestMetadata("invokeOnQualified.kt")
                    public void testInvokeOnQualified() throws Exception {
                        runTest("testData/unifier/equivalence/expressions/conventions/invoke/invokeOnQualified.kt");
                    }

                    @TestMetadata("invokeOnVar.kt")
                    public void testInvokeOnVar() throws Exception {
                        runTest("testData/unifier/equivalence/expressions/conventions/invoke/invokeOnVar.kt");
                    }
                }
            }

            @RunWith(JUnit3RunnerWithInners.class)
            @TestMetadata("testData/unifier/equivalence/expressions/misc")
            public static class Misc extends AbstractPsiUnifierTest {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
                }

                @TestMetadata("misc1.kt")
                public void testMisc1() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/misc/misc1.kt");
                }

                @TestMetadata("misc2.kt")
                public void testMisc2() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/misc/misc2.kt");
                }

                @TestMetadata("misc3.kt")
                public void testMisc3() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/misc/misc3.kt");
                }
            }

            @RunWith(JUnit3RunnerWithInners.class)
            @TestMetadata("testData/unifier/equivalence/expressions/super")
            public static class Super extends AbstractPsiUnifierTest {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
                }

                @TestMetadata("multipleSuperTypes.kt")
                public void testMultipleSuperTypes() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/super/multipleSuperTypes.kt");
                }

                @TestMetadata("qualifiedByClass1.kt")
                public void testQualifiedByClass1() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/super/qualifiedByClass1.kt");
                }

                @TestMetadata("qualifiedByClass2.kt")
                public void testQualifiedByClass2() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/super/qualifiedByClass2.kt");
                }

                @TestMetadata("qualifiedByClass3.kt")
                public void testQualifiedByClass3() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/super/qualifiedByClass3.kt");
                }
            }

            @RunWith(JUnit3RunnerWithInners.class)
            @TestMetadata("testData/unifier/equivalence/expressions/this")
            public static class This extends AbstractPsiUnifierTest {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
                }

                @TestMetadata("anonymousObjects.kt")
                public void testAnonymousObjects() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/this/anonymousObjects.kt");
                }

                @TestMetadata("qualifiedByClass1.kt")
                public void testQualifiedByClass1() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/this/qualifiedByClass1.kt");
                }

                @TestMetadata("qualifiedByClass2.kt")
                public void testQualifiedByClass2() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/this/qualifiedByClass2.kt");
                }

                @TestMetadata("qualifiedByClass3.kt")
                public void testQualifiedByClass3() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/this/qualifiedByClass3.kt");
                }

                @TestMetadata("qualifiedByFunction1.kt")
                public void testQualifiedByFunction1() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/this/qualifiedByFunction1.kt");
                }

                @TestMetadata("qualifiedByFunction2.kt")
                public void testQualifiedByFunction2() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/this/qualifiedByFunction2.kt");
                }

                @TestMetadata("qualifiedByFunction3.kt")
                public void testQualifiedByFunction3() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/this/qualifiedByFunction3.kt");
                }

                @TestMetadata("simpleThis1Runtime.kt")
                public void testSimpleThis1Runtime() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/this/simpleThis1Runtime.kt");
                }

                @TestMetadata("simpleThis2Runtime.kt")
                public void testSimpleThis2Runtime() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/this/simpleThis2Runtime.kt");
                }

                @TestMetadata("thisAsCallee.kt")
                public void testThisAsCallee() throws Exception {
                    runTest("testData/unifier/equivalence/expressions/this/thisAsCallee.kt");
                }
            }
        }

        @RunWith(JUnit3RunnerWithInners.class)
        @TestMetadata("testData/unifier/equivalence/types")
        public static class Types extends AbstractPsiUnifierTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
            }

            @TestMetadata("function0.kt")
            public void testFunction0() throws Exception {
                runTest("testData/unifier/equivalence/types/function0.kt");
            }

            @TestMetadata("function1.kt")
            public void testFunction1() throws Exception {
                runTest("testData/unifier/equivalence/types/function1.kt");
            }

            @TestMetadata("function2.kt")
            public void testFunction2() throws Exception {
                runTest("testData/unifier/equivalence/types/function2.kt");
            }

            @TestMetadata("nonNullable.kt")
            public void testNonNullable() throws Exception {
                runTest("testData/unifier/equivalence/types/nonNullable.kt");
            }

            @TestMetadata("nullable.kt")
            public void testNullable() throws Exception {
                runTest("testData/unifier/equivalence/types/nullable.kt");
            }

            @TestMetadata("userTypeRuntime.kt")
            public void testUserTypeRuntime() throws Exception {
                runTest("testData/unifier/equivalence/types/userTypeRuntime.kt");
            }
        }
    }
}
