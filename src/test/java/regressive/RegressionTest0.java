package regressive;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        relationship.filter.RequirementCreditFilter requirementCreditFilter0 = new relationship.filter.RequirementCreditFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = requirementCreditFilter0.canEnroll((java.lang.Long) 100L, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        relationship.filter.ApprovedFilter approvedFilter0 = new relationship.filter.ApprovedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long2 = approvedFilter0.creditFromStudent((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView6 = new functional.view.StudentView(studentEntity5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = studentView6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        relationship.filter.ApprovedFilter approvedFilter0 = new relationship.filter.ApprovedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long2 = approvedFilter0.creditFromStudent((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        relationship.filter.RequirementCreditFilter requirementCreditFilter0 = new relationship.filter.RequirementCreditFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = requirementCreditFilter0.canEnroll((java.lang.Long) 0L, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        relationship.filter.ApprovedFilter approvedFilter0 = new relationship.filter.ApprovedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList2 = approvedFilter0.approvalsFromStudent((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship0 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship0.setSubject((java.lang.Long) 0L);
        requirementSubjectRelationship0.setParent((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass5 = requirementSubjectRelationship0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView6 = new functional.view.StudentView(studentEntity5);
        basic.StudentEntity studentEntity7 = studentView6.getStudentEntity();
        java.lang.String str8 = studentEntity7.getRegistration();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        relationship.filter.RequirementCreditFilter requirementCreditFilter0 = new relationship.filter.RequirementCreditFilter();
        // The following exception was thrown during execution in test generation
        try {
            relationship.RequirementCreditRelationship requirementCreditRelationship2 = requirementCreditFilter0.fromSubject((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        relationship.filter.RequirementCreditFilter requirementCreditFilter0 = new relationship.filter.RequirementCreditFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = requirementCreditFilter0.toMasterSubject((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        relationship.filter.RequirementSubjectFilter requirementSubjectFilter0 = new relationship.filter.RequirementSubjectFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = requirementSubjectFilter0.canEnroll((java.lang.Long) (-1L), (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        relationship.filter.RequirementSubjectFilter requirementSubjectFilter0 = new relationship.filter.RequirementSubjectFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = requirementSubjectFilter0.canEnroll((java.lang.Long) 100L, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList2 = offeredFilter0.fromDepartment((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList2 = offeredFilter0.fromDepartment((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList2 = offeredFilter0.fromCourse((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList2 = offeredFilter0.fromDepartment((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        relationship.MatriculateRelationship matriculateRelationship0 = new relationship.MatriculateRelationship();
        java.lang.Long long1 = matriculateRelationship0.getSubject();
        matriculateRelationship0.setSubject((java.lang.Long) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        relationship.filter.RequirementCreditFilter requirementCreditFilter0 = new relationship.filter.RequirementCreditFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = requirementCreditFilter0.canEnroll((java.lang.Long) 0L, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        basic.SubjectEntity subjectEntity0 = new basic.SubjectEntity();
        subjectEntity0.setCredit((java.lang.Long) 100L);
        subjectEntity0.setLevel((java.lang.Long) 0L);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList3 = offeredFilter0.fromDepartmentToStudent((java.lang.Long) 10L, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        basic.DepartmentEntity departmentEntity0 = new basic.DepartmentEntity();
        boolean boolean2 = departmentEntity0.equals((java.lang.Object) 1L);
        departmentEntity0.setName("");
        departmentEntity0.setName("hi!");
        departmentEntity0.setId((long) (byte) 0);
        boolean boolean9 = departmentEntity0.validation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        relationship.filter.ApprovedFilter approvedFilter0 = new relationship.filter.ApprovedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList2 = approvedFilter0.approvalsFromStudent((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        relationship.filter.ApprovedFilter approvedFilter0 = new relationship.filter.ApprovedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList2 = approvedFilter0.approvalsFromStudent((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        relationship.filter.RequirementSubjectFilter requirementSubjectFilter0 = new relationship.filter.RequirementSubjectFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<relationship.RequirementSubjectRelationship> requirementSubjectRelationshipList2 = requirementSubjectFilter0.fromSubject((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship0 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship0.setSubject((java.lang.Long) 0L);
        requirementSubjectRelationship0.setParent((java.lang.Long) 10L);
        requirementSubjectRelationship0.setSubject((java.lang.Long) 100L);
        java.lang.Long long7 = requirementSubjectRelationship0.getParent();
        relationship.MatriculateRelationship matriculateRelationship10 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        long long11 = matriculateRelationship10.getId();
        boolean boolean12 = requirementSubjectRelationship0.equals((java.lang.Object) matriculateRelationship10);
        boolean boolean14 = matriculateRelationship10.equals((java.lang.Object) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 0L, (java.lang.Long) 100L, (java.lang.Integer) (-1), (java.lang.Boolean) false, (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        subjectEntity9.setWorkload((java.lang.Integer) 100);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList3 = offeredFilter0.fromCourseToStudent((java.lang.Long) 0L, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        relationship.filter.MatriculateFilter matriculateFilter0 = new relationship.filter.MatriculateFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<relationship.MatriculateRelationship> matriculateRelationshipList2 = matriculateFilter0.subjectMatriculateFrom((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        relationship.filter.RequirementCreditFilter requirementCreditFilter0 = new relationship.filter.RequirementCreditFilter();
        // The following exception was thrown during execution in test generation
        try {
            relationship.RequirementCreditRelationship requirementCreditRelationship2 = requirementCreditFilter0.fromSubject((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        basic.SecretaryEntity secretaryEntity0 = new basic.SecretaryEntity();
        secretaryEntity0.setDepartment((java.lang.Long) (-1L));
        secretaryEntity0.setLevel((java.lang.Long) 10L);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        functional.Matriculation matriculation0 = new functional.Matriculation();
        java.util.List<basic.StudentEntity> studentEntityList1 = matriculation0.getStudentAvailable();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.StudentEntity> studentEntityList2 = matriculation0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntityList1);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        relationship.filter.RequirementSubjectFilter requirementSubjectFilter0 = new relationship.filter.RequirementSubjectFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<relationship.RequirementSubjectRelationship> requirementSubjectRelationshipList2 = requirementSubjectFilter0.fromSubject((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        relationship.filter.RequirementCreditFilter requirementCreditFilter0 = new relationship.filter.RequirementCreditFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = requirementCreditFilter0.toMasterSubject((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        boolean boolean5 = courseEntity3.validation();
        courseEntity3.setId((long) (short) 0);
        relationship.MatriculateRelationship matriculateRelationship10 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        long long11 = matriculateRelationship10.getId();
        matriculateRelationship10.setStudent((java.lang.Long) 10L);
        boolean boolean14 = courseEntity3.equals((java.lang.Object) 10L);
        boolean boolean15 = courseEntity3.validation();
        java.lang.Long long16 = courseEntity3.getDepartment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16.equals(1L));
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        relationship.MatriculateRelationship matriculateRelationship2 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        long long3 = matriculateRelationship2.getId();
        matriculateRelationship2.setId((long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long6 = studentEntity5.getCourse();
        java.lang.Long long7 = studentEntity5.getLevel();
        long long8 = studentEntity5.getId();
        java.lang.Long long9 = studentEntity5.getCourse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9.equals(10L));
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship0 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship0.setSubject((java.lang.Long) 0L);
        requirementSubjectRelationship0.setParent((java.lang.Long) 1L);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        relationship.filter.MatriculateFilter matriculateFilter0 = new relationship.filter.MatriculateFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<relationship.MatriculateRelationship> matriculateRelationshipList2 = matriculateFilter0.studentMatriculateFrom((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity9.setDescription("");
        subjectEntity9.setWorkload((java.lang.Integer) 100);
        basic.StudentEntity studentEntity19 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView20 = new functional.view.StudentView(studentEntity19);
        basic.StudentEntity studentEntity21 = studentView20.getStudentEntity();
        basic.StudentEntity studentEntity22 = studentView20.getStudentEntity();
        basic.StudentEntity studentEntity23 = studentView20.getStudentEntity();
        boolean boolean24 = subjectEntity9.equals((java.lang.Object) studentEntity23);
        subjectEntity9.setCode("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList2 = offeredFilter0.fromCourse((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        basic.CourseEntity courseEntity0 = new basic.CourseEntity();
        courseEntity0.setLevel((java.lang.Long) 0L);
        courseEntity0.setLevel((java.lang.Long) (-1L));
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity9.setDescription("");
        java.lang.Boolean boolean12 = subjectEntity9.getBinding();
        subjectEntity9.setCourse((java.lang.Long) (-1L));
        subjectEntity9.setLevel((java.lang.Long) 100L);
        boolean boolean17 = subjectEntity9.validation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity3.setName("");
        secretaryEntity3.setName("");
        java.lang.Class<?> wildcardClass8 = secretaryEntity3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        relationship.filter.MatriculateFilter matriculateFilter0 = new relationship.filter.MatriculateFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<relationship.MatriculateRelationship> matriculateRelationshipList2 = matriculateFilter0.subjectMatriculateFrom((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList3 = offeredFilter0.fromDepartmentToStudent((java.lang.Long) (-1L), (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        relationship.filter.RequirementCreditFilter requirementCreditFilter0 = new relationship.filter.RequirementCreditFilter();
        // The following exception was thrown during execution in test generation
        try {
            relationship.RequirementCreditRelationship requirementCreditRelationship2 = requirementCreditFilter0.fromSubject((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity9.setDescription("");
        subjectEntity9.setCode("");
        java.lang.Long long14 = subjectEntity9.getLevel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14.equals(1L));
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity9.setDescription("");
        boolean boolean12 = subjectEntity9.validation();
        subjectEntity9.setWorkload((java.lang.Integer) 100);
        java.lang.String str15 = subjectEntity9.getCode();
        java.lang.Long long16 = subjectEntity9.getLevel();
        boolean boolean17 = subjectEntity9.validation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView6 = new functional.view.StudentView(studentEntity5);
        basic.StudentEntity studentEntity7 = studentView6.getStudentEntity();
        basic.StudentEntity studentEntity13 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView14 = new functional.view.StudentView(studentEntity13);
        java.lang.Long long15 = studentEntity13.getLevel();
        java.lang.String str16 = studentEntity13.getRegistration();
        studentView6.setStudentEntity(studentEntity13);
        java.lang.String str18 = studentEntity13.getRegistration();
        java.lang.Long long19 = studentEntity13.getCourse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19.equals(10L));
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship0 = new relationship.RequirementSubjectRelationship();
        java.lang.Long long1 = requirementSubjectRelationship0.getSubject();
        relationship.RequirementCreditRelationship requirementCreditRelationship4 = new relationship.RequirementCreditRelationship((java.lang.Long) 1L, (java.lang.Long) 10L);
        requirementCreditRelationship4.setId((long) (short) 100);
        long long7 = requirementCreditRelationship4.getId();
        java.lang.Long long8 = requirementCreditRelationship4.getSubject();
        boolean boolean9 = requirementSubjectRelationship0.equals((java.lang.Object) long8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        relationship.filter.ApprovedFilter approvedFilter0 = new relationship.filter.ApprovedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long2 = approvedFilter0.creditFromStudent((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        basic.SubjectEntity subjectEntity0 = new basic.SubjectEntity();
        java.lang.Boolean boolean1 = subjectEntity0.getBinding();
        java.lang.String str2 = subjectEntity0.getName();
        subjectEntity0.setCourse((java.lang.Long) (-1L));
        java.lang.Integer int5 = subjectEntity0.getWorkload();
        java.lang.Integer int6 = subjectEntity0.getWorkload();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship0 = new relationship.RequirementSubjectRelationship();
        basic.StudentEntity studentEntity6 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long7 = studentEntity6.getCourse();
        functional.view.StudentView studentView8 = new functional.view.StudentView(studentEntity6);
        boolean boolean9 = requirementSubjectRelationship0.equals((java.lang.Object) studentView8);
        java.lang.Long long10 = requirementSubjectRelationship0.getSubject();
        java.lang.Long long11 = requirementSubjectRelationship0.getSubject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long11);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        relationship.filter.MatriculateFilter matriculateFilter0 = new relationship.filter.MatriculateFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<relationship.MatriculateRelationship> matriculateRelationshipList2 = matriculateFilter0.subjectMatriculateFrom((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        relationship.filter.RequirementSubjectFilter requirementSubjectFilter0 = new relationship.filter.RequirementSubjectFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = requirementSubjectFilter0.canEnroll((java.lang.Long) 1L, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        relationship.filter.MatriculateFilter matriculateFilter0 = new relationship.filter.MatriculateFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<relationship.MatriculateRelationship> matriculateRelationshipList2 = matriculateFilter0.studentMatriculateFrom((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        boolean boolean5 = courseEntity3.validation();
        courseEntity3.setId((long) (short) 0);
        relationship.RequirementSubjectRelationship requirementSubjectRelationship8 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship8.setSubject((java.lang.Long) 0L);
        requirementSubjectRelationship8.setParent((java.lang.Long) 10L);
        requirementSubjectRelationship8.setSubject((java.lang.Long) 100L);
        requirementSubjectRelationship8.setId(10L);
        boolean boolean17 = courseEntity3.equals((java.lang.Object) requirementSubjectRelationship8);
        long long18 = requirementSubjectRelationship8.getId();
        requirementSubjectRelationship8.setSubject((java.lang.Long) 0L);
        java.lang.Long long21 = requirementSubjectRelationship8.getParent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21.equals(10L));
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        relationship.filter.ApprovedFilter approvedFilter0 = new relationship.filter.ApprovedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList2 = approvedFilter0.approvalsFromStudent((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        functional.view.SubjectView subjectView0 = new functional.view.SubjectView();
        basic.SubjectEntity subjectEntity1 = subjectView0.getSubjectEntity();
        basic.SubjectEntity subjectEntity11 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        java.lang.String str12 = subjectEntity11.getDescription();
        subjectView0.setSubjectEntity(subjectEntity11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = subjectView0.toString();
            org.junit.Assert.fail("Expected exception of type org.hibernate.UnknownEntityTypeException; message: Unable to locate persister: basic.TeacherEntity");
        } catch (org.hibernate.UnknownEntityTypeException e) {
            // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntity1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList3 = offeredFilter0.fromCourseToStudent((java.lang.Long) (-1L), (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList3 = offeredFilter0.fromCourseToStudent((java.lang.Long) 0L, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        relationship.filter.RequirementCreditFilter requirementCreditFilter0 = new relationship.filter.RequirementCreditFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = requirementCreditFilter0.toMasterSubject((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        basic.DepartmentEntity departmentEntity2 = new basic.DepartmentEntity("", (java.lang.Long) 100L);
        boolean boolean3 = departmentEntity2.validation();
        boolean boolean4 = departmentEntity2.validation();
        departmentEntity2.setName("");
        long long7 = departmentEntity2.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        relationship.MatriculateRelationship matriculateRelationship0 = new relationship.MatriculateRelationship();
        java.lang.Long long1 = matriculateRelationship0.getSubject();
        long long2 = matriculateRelationship0.getId();
        java.lang.Long long3 = matriculateRelationship0.getStudent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        relationship.filter.RequirementCreditFilter requirementCreditFilter0 = new relationship.filter.RequirementCreditFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = requirementCreditFilter0.toMasterSubject((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship0 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship0.setSubject((java.lang.Long) 0L);
        boolean boolean4 = requirementSubjectRelationship0.equals((java.lang.Object) (short) -1);
        relationship.RequirementSubjectRelationship requirementSubjectRelationship5 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship5.setSubject((java.lang.Long) 0L);
        boolean boolean9 = requirementSubjectRelationship5.equals((java.lang.Object) (short) -1);
        java.lang.Long long10 = requirementSubjectRelationship5.getSubject();
        boolean boolean11 = requirementSubjectRelationship0.equals((java.lang.Object) long10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship0 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship0.setSubject((java.lang.Long) 0L);
        boolean boolean4 = requirementSubjectRelationship0.equals((java.lang.Object) (short) -1);
        java.lang.Long long5 = requirementSubjectRelationship0.getSubject();
        requirementSubjectRelationship0.setSubject((java.lang.Long) 0L);
        requirementSubjectRelationship0.setParent((java.lang.Long) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5.equals(0L));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        functional.view.SubjectView subjectView0 = new functional.view.SubjectView();
        basic.SubjectEntity subjectEntity1 = subjectView0.getSubjectEntity();
        basic.SubjectEntity subjectEntity2 = new basic.SubjectEntity();
        subjectView0.setSubjectEntity(subjectEntity2);
        basic.SubjectEntity subjectEntity4 = subjectView0.getSubjectEntity();
        java.lang.String str5 = subjectView0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntity1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(subjectEntity4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        functional.view.SecretaryView secretaryView0 = new functional.view.SecretaryView();
        basic.SecretaryEntity secretaryEntity4 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity4.setLevel((java.lang.Long) 0L);
        secretaryView0.setSecretaryEntity(secretaryEntity4);
        basic.SecretaryEntity secretaryEntity11 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity11.setName("");
        secretaryEntity11.setName("");
        secretaryEntity11.setName("");
        java.lang.String str18 = secretaryEntity11.getName();
        secretaryEntity11.setLevel((java.lang.Long) 0L);
        secretaryView0.setSecretaryEntity(secretaryEntity11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = secretaryView0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        relationship.filter.RequirementSubjectFilter requirementSubjectFilter0 = new relationship.filter.RequirementSubjectFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = requirementSubjectFilter0.canEnroll((java.lang.Long) 100L, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity3.setName("");
        secretaryEntity3.setName("");
        secretaryEntity3.setName("");
        java.lang.String str10 = secretaryEntity3.getName();
        secretaryEntity3.setId((long) (byte) 1);
        secretaryEntity3.setName("hi!");
        secretaryEntity3.setId((long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList2 = offeredFilter0.fromCourse((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList2 = offeredFilter0.fromCourse((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity9.setDescription("");
        boolean boolean12 = subjectEntity9.validation();
        subjectEntity9.setDescription("");
        subjectEntity9.setCourse((java.lang.Long) 0L);
        subjectEntity9.setName("hi!");
        java.lang.Long long19 = subjectEntity9.getCredit();
        subjectEntity9.setCode("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19.equals((-1L)));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long6 = studentEntity5.getCourse();
        java.lang.Long long7 = studentEntity5.getLevel();
        studentEntity5.setId((long) ' ');
        long long10 = studentEntity5.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList2 = offeredFilter0.fromDepartment((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        java.lang.Long long10 = subjectEntity9.getResponsibleTeacher();
        boolean boolean11 = subjectEntity9.isNull();
        java.lang.Long long12 = subjectEntity9.getLevel();
        basic.StudentEntity studentEntity18 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView19 = new functional.view.StudentView(studentEntity18);
        basic.StudentEntity studentEntity20 = studentView19.getStudentEntity();
        java.lang.Long long21 = studentEntity20.getCourse();
        java.lang.String str22 = studentEntity20.getRegistration();
        boolean boolean23 = studentEntity20.validation();
        studentEntity20.setName("hi!");
        boolean boolean26 = subjectEntity9.equals((java.lang.Object) studentEntity20);
        java.lang.Long long27 = studentEntity20.getLevel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27.equals(1L));
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        relationship.filter.RequirementCreditFilter requirementCreditFilter0 = new relationship.filter.RequirementCreditFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = requirementCreditFilter0.toMasterSubject((java.lang.Long) 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        relationship.ApprovedRelationship approvedRelationship2 = new relationship.ApprovedRelationship((java.lang.Long) 10L, (java.lang.Long) 0L);
        java.lang.Long long3 = approvedRelationship2.getStudent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3.equals(10L));
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        relationship.filter.RequirementSubjectFilter requirementSubjectFilter0 = new relationship.filter.RequirementSubjectFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<relationship.RequirementSubjectRelationship> requirementSubjectRelationshipList2 = requirementSubjectFilter0.fromSubject((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        java.lang.Long long10 = subjectEntity9.getResponsibleTeacher();
        boolean boolean11 = subjectEntity9.isNull();
        java.lang.Long long12 = subjectEntity9.getLevel();
        basic.StudentEntity studentEntity18 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView19 = new functional.view.StudentView(studentEntity18);
        basic.StudentEntity studentEntity20 = studentView19.getStudentEntity();
        java.lang.Long long21 = studentEntity20.getCourse();
        java.lang.String str22 = studentEntity20.getRegistration();
        boolean boolean23 = studentEntity20.validation();
        studentEntity20.setName("hi!");
        boolean boolean26 = subjectEntity9.equals((java.lang.Object) studentEntity20);
        studentEntity20.setCourse((java.lang.Long) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        relationship.filter.RequirementSubjectFilter requirementSubjectFilter0 = new relationship.filter.RequirementSubjectFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = requirementSubjectFilter0.canEnroll((java.lang.Long) 0L, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "", (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Integer) 0, (java.lang.Boolean) true, (java.lang.Long) 1L, (java.lang.Long) 100L, "");
        subjectEntity9.setBinding((java.lang.Boolean) true);
        subjectEntity9.setLevel((java.lang.Long) (-1L));
        subjectEntity9.setResponsibleTeacher((java.lang.Long) 1L);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity3.setLevel((java.lang.Long) 0L);
        secretaryEntity3.setName("hi!");
        java.lang.String str8 = secretaryEntity3.getName();
        java.lang.Long long9 = secretaryEntity3.getLevel();
        java.lang.Long long10 = secretaryEntity3.getLevel();
        java.lang.String str11 = secretaryEntity3.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        basic.DepartmentEntity departmentEntity0 = new basic.DepartmentEntity();
        boolean boolean2 = departmentEntity0.equals((java.lang.Object) 1L);
        departmentEntity0.setName("");
        departmentEntity0.setName("hi!");
        boolean boolean8 = departmentEntity0.equals((java.lang.Object) (byte) -1);
        java.lang.Long long9 = departmentEntity0.getResponsible();
        relationship.RequirementCreditRelationship requirementCreditRelationship12 = new relationship.RequirementCreditRelationship((java.lang.Long) 1L, (java.lang.Long) 10L);
        requirementCreditRelationship12.setCredit((java.lang.Long) 1L);
        requirementCreditRelationship12.setSubject((java.lang.Long) 10L);
        requirementCreditRelationship12.setCredit((java.lang.Long) 100L);
        boolean boolean19 = departmentEntity0.equals((java.lang.Object) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        relationship.filter.RequirementCreditFilter requirementCreditFilter0 = new relationship.filter.RequirementCreditFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = requirementCreditFilter0.canEnroll((java.lang.Long) 1L, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        functional.view.SecretaryView secretaryView0 = new functional.view.SecretaryView();
        basic.SecretaryEntity secretaryEntity4 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity4.setName("");
        secretaryView0.setSecretaryEntity(secretaryEntity4);
        basic.SecretaryEntity secretaryEntity8 = null;
        secretaryView0.setSecretaryEntity(secretaryEntity8);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        relationship.filter.RequirementCreditFilter requirementCreditFilter0 = new relationship.filter.RequirementCreditFilter();
        // The following exception was thrown during execution in test generation
        try {
            relationship.RequirementCreditRelationship requirementCreditRelationship2 = requirementCreditFilter0.fromSubject((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList3 = offeredFilter0.fromCourseToStudent((java.lang.Long) 32L, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        relationship.filter.RequirementCreditFilter requirementCreditFilter0 = new relationship.filter.RequirementCreditFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = requirementCreditFilter0.canEnroll((java.lang.Long) 1L, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity3.setName("");
        secretaryEntity3.setName("");
        secretaryEntity3.setName("");
        secretaryEntity3.setName("");
        secretaryEntity3.setName("");
        secretaryEntity3.setDepartment((java.lang.Long) (-1L));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        functional.Matriculation matriculation0 = new functional.Matriculation();
        java.lang.Boolean boolean1 = matriculation0.doMatriculation();
        java.lang.Boolean boolean2 = matriculation0.doMatriculation();
        java.lang.Boolean boolean3 = matriculation0.doMatriculation();
        java.lang.Class<?> wildcardClass4 = matriculation0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList3 = offeredFilter0.fromDepartmentToStudent((java.lang.Long) 0L, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity9.setDescription("");
        boolean boolean12 = subjectEntity9.validation();
        subjectEntity9.setWorkload((java.lang.Integer) 100);
        java.lang.String str15 = subjectEntity9.getCode();
        java.lang.Long long16 = subjectEntity9.getLevel();
        java.lang.Integer int17 = subjectEntity9.getWorkload();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17.equals(100));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList3 = offeredFilter0.fromDepartmentToStudent((java.lang.Long) 1L, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 100L, (java.lang.Integer) 10, (java.lang.Boolean) false, (java.lang.Long) (-1L), (java.lang.Long) 100L, "");
        java.lang.Long long10 = subjectEntity9.getCredit();
        subjectEntity9.setCode("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10.equals(100L));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        relationship.filter.ApprovedFilter approvedFilter0 = new relationship.filter.ApprovedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long2 = approvedFilter0.creditFromStudent((java.lang.Long) 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        functional.view.SecretaryView secretaryView0 = new functional.view.SecretaryView();
        basic.SecretaryEntity secretaryEntity4 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity4.setName("");
        secretaryView0.setSecretaryEntity(secretaryEntity4);
        basic.SecretaryEntity secretaryEntity8 = new basic.SecretaryEntity();
        secretaryEntity8.setLevel((java.lang.Long) 10L);
        secretaryView0.setSecretaryEntity(secretaryEntity8);
        long long12 = secretaryEntity8.getId();
        boolean boolean13 = secretaryEntity8.validation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList3 = offeredFilter0.fromDepartmentToStudent((java.lang.Long) 0L, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        relationship.filter.RequirementSubjectFilter requirementSubjectFilter0 = new relationship.filter.RequirementSubjectFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = requirementSubjectFilter0.canEnroll((java.lang.Long) 1L, (java.lang.Long) 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        relationship.filter.RequirementSubjectFilter requirementSubjectFilter0 = new relationship.filter.RequirementSubjectFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = requirementSubjectFilter0.canEnroll((java.lang.Long) 100L, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        java.lang.Long long10 = subjectEntity9.getResponsibleTeacher();
        java.lang.String str11 = subjectEntity9.getCode();
        java.lang.String str12 = subjectEntity9.getDescription();
        boolean boolean13 = subjectEntity9.validation();
        subjectEntity9.setCredit((java.lang.Long) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "", (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Integer) 0, (java.lang.Boolean) true, (java.lang.Long) 1L, (java.lang.Long) 100L, "");
        subjectEntity9.setBinding((java.lang.Boolean) true);
        java.lang.Boolean boolean12 = subjectEntity9.getBinding();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12.equals(true));
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        basic.TeacherEntity teacherEntity2 = new basic.TeacherEntity("", (java.lang.Long) (-1L));
        teacherEntity2.setId(0L);
        relationship.ApprovedRelationship approvedRelationship7 = new relationship.ApprovedRelationship((java.lang.Long) (-1L), (java.lang.Long) 1L);
        relationship.RequirementSubjectRelationship requirementSubjectRelationship8 = new relationship.RequirementSubjectRelationship();
        basic.StudentEntity studentEntity14 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long15 = studentEntity14.getCourse();
        functional.view.StudentView studentView16 = new functional.view.StudentView(studentEntity14);
        boolean boolean17 = requirementSubjectRelationship8.equals((java.lang.Object) studentView16);
        basic.StudentEntity studentEntity23 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView24 = new functional.view.StudentView(studentEntity23);
        basic.StudentEntity studentEntity25 = studentView24.getStudentEntity();
        java.lang.Long long26 = studentEntity25.getCourse();
        java.lang.String str27 = studentEntity25.getRegistration();
        boolean boolean28 = studentEntity25.validation();
        studentView16.setStudentEntity(studentEntity25);
        boolean boolean30 = approvedRelationship7.equals((java.lang.Object) studentView16);
        boolean boolean31 = teacherEntity2.equals((java.lang.Object) approvedRelationship7);
        boolean boolean32 = teacherEntity2.validation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        basic.SubjectEntity subjectEntity0 = new basic.SubjectEntity();
        subjectEntity0.setCourse((java.lang.Long) 1L);
        long long3 = subjectEntity0.getId();
        boolean boolean4 = subjectEntity0.isNull();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        relationship.OfferedRelationship offeredRelationship2 = new relationship.OfferedRelationship((java.lang.Long) 100L, (java.lang.Long) 10L);
        offeredRelationship2.setId(1L);
        offeredRelationship2.setCourse((java.lang.Long) 0L);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList2 = offeredFilter0.fromDepartment((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 100L, (java.lang.Integer) 10, (java.lang.Boolean) false, (java.lang.Long) (-1L), (java.lang.Long) 100L, "");
        java.lang.Long long10 = subjectEntity9.getCredit();
        java.lang.String str11 = subjectEntity9.getCode();
        java.lang.Long long12 = subjectEntity9.getLevel();
        relationship.OfferedRelationship offeredRelationship15 = new relationship.OfferedRelationship((java.lang.Long) 100L, (java.lang.Long) 10L);
        offeredRelationship15.setId(1L);
        offeredRelationship15.setSubject((java.lang.Long) 0L);
        java.lang.Long long20 = offeredRelationship15.getCourse();
        java.lang.Long long21 = offeredRelationship15.getSubject();
        relationship.RequirementCreditRelationship requirementCreditRelationship24 = new relationship.RequirementCreditRelationship((java.lang.Long) 1L, (java.lang.Long) 10L);
        java.lang.Long long25 = requirementCreditRelationship24.getCredit();
        boolean boolean26 = offeredRelationship15.equals((java.lang.Object) long25);
        java.lang.Long long27 = offeredRelationship15.getSubject();
        boolean boolean28 = subjectEntity9.equals((java.lang.Object) long27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList2 = offeredFilter0.fromDepartment((java.lang.Long) 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        java.lang.Long long5 = courseEntity3.getDepartment();
        boolean boolean6 = courseEntity3.validation();
        java.lang.Long long7 = courseEntity3.getLevel();
        courseEntity3.setId(100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7.equals(0L));
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView6 = new functional.view.StudentView(studentEntity5);
        studentEntity5.setId((long) 1);
        functional.view.StudentView studentView9 = new functional.view.StudentView(studentEntity5);
        functional.view.StudentView studentView10 = new functional.view.StudentView(studentEntity5);
        basic.StudentEntity studentEntity16 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.String str17 = studentEntity16.getRegistration();
        studentEntity16.setCourse((java.lang.Long) (-1L));
        java.lang.Long long20 = studentEntity16.getCourse();
        studentView10.setStudentEntity(studentEntity16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = studentView10.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20.equals((-1L)));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        relationship.ApprovedRelationship approvedRelationship2 = new relationship.ApprovedRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        approvedRelationship2.setId((java.lang.Long) 10L);
        approvedRelationship2.setId((java.lang.Long) 0L);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        relationship.ApprovedRelationship approvedRelationship2 = new relationship.ApprovedRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        relationship.ApprovedRelationship approvedRelationship5 = new relationship.ApprovedRelationship((java.lang.Long) (-1L), (java.lang.Long) 1L);
        boolean boolean6 = approvedRelationship2.equals((java.lang.Object) (-1L));
        approvedRelationship2.setStudent((java.lang.Long) 1L);
        approvedRelationship2.setStudent((java.lang.Long) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        java.lang.Long long10 = subjectEntity9.getResponsibleTeacher();
        boolean boolean11 = subjectEntity9.isNull();
        subjectEntity9.setCourse((java.lang.Long) (-1L));
        subjectEntity9.setBinding((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        basic.TeacherEntity teacherEntity0 = new basic.TeacherEntity();
        java.lang.String str1 = teacherEntity0.getName();
        teacherEntity0.setId((long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        functional.view.SecretaryView secretaryView0 = new functional.view.SecretaryView();
        basic.SecretaryEntity secretaryEntity4 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity4.setLevel((java.lang.Long) 0L);
        secretaryView0.setSecretaryEntity(secretaryEntity4);
        basic.SecretaryEntity secretaryEntity11 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity11.setLevel((java.lang.Long) 0L);
        basic.TeacherEntity teacherEntity14 = new basic.TeacherEntity();
        java.lang.String str15 = teacherEntity14.getName();
        teacherEntity14.setName("");
        long long18 = teacherEntity14.getId();
        java.lang.Long long19 = teacherEntity14.getDepartment();
        boolean boolean20 = secretaryEntity11.equals((java.lang.Object) teacherEntity14);
        secretaryView0.setSecretaryEntity(secretaryEntity11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = secretaryView0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        relationship.filter.RequirementSubjectFilter requirementSubjectFilter0 = new relationship.filter.RequirementSubjectFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = requirementSubjectFilter0.canEnroll((java.lang.Long) 32L, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        java.lang.Long long5 = courseEntity3.getDepartment();
        courseEntity3.setLevel((java.lang.Long) (-1L));
        courseEntity3.setDepartment((java.lang.Long) 0L);
        courseEntity3.setDepartment((java.lang.Long) 1L);
        courseEntity3.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5.equals(1L));
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        relationship.filter.RequirementSubjectFilter requirementSubjectFilter0 = new relationship.filter.RequirementSubjectFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<relationship.RequirementSubjectRelationship> requirementSubjectRelationshipList2 = requirementSubjectFilter0.fromSubject((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList3 = offeredFilter0.fromCourseToStudent((java.lang.Long) 0L, (java.lang.Long) 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity9.setDescription("");
        boolean boolean12 = subjectEntity9.validation();
        subjectEntity9.setDescription("");
        subjectEntity9.setCourse((java.lang.Long) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity9.setDescription("");
        boolean boolean12 = subjectEntity9.validation();
        subjectEntity9.setCourse((java.lang.Long) 1L);
        java.lang.String str15 = subjectEntity9.getDescription();
        boolean boolean16 = subjectEntity9.validation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        functional.Matriculation matriculation0 = new functional.Matriculation();
        basic.StudentEntity studentEntity1 = matriculation0.getSelectedStudent();
        java.util.List<basic.StudentEntity> studentEntityList2 = null;
        matriculation0.setStudentAvailable(studentEntityList2);
        java.util.List<basic.SubjectEntity> subjectEntityList4 = matriculation0.getOffer();
        java.util.List<basic.SubjectEntity> subjectEntityList5 = matriculation0.getOffer();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.StudentEntity> studentEntityList6 = matriculation0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntityList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntityList5);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        java.lang.Long long10 = subjectEntity9.getResponsibleTeacher();
        java.lang.String str11 = subjectEntity9.getCode();
        java.lang.String str12 = subjectEntity9.getCode();
        boolean boolean13 = subjectEntity9.validation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity3.setLevel((java.lang.Long) 0L);
        basic.TeacherEntity teacherEntity6 = new basic.TeacherEntity();
        java.lang.String str7 = teacherEntity6.getName();
        teacherEntity6.setName("");
        long long10 = teacherEntity6.getId();
        java.lang.Long long11 = teacherEntity6.getDepartment();
        boolean boolean12 = secretaryEntity3.equals((java.lang.Object) teacherEntity6);
        basic.SubjectEntity subjectEntity22 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        java.lang.String str23 = subjectEntity22.getDescription();
        boolean boolean24 = secretaryEntity3.equals((java.lang.Object) str23);
        secretaryEntity3.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        relationship.filter.RequirementCreditFilter requirementCreditFilter0 = new relationship.filter.RequirementCreditFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = requirementCreditFilter0.canEnroll((java.lang.Long) 100L, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        basic.TeacherEntity teacherEntity2 = new basic.TeacherEntity("", (java.lang.Long) (-1L));
        teacherEntity2.setId(0L);
        relationship.ApprovedRelationship approvedRelationship7 = new relationship.ApprovedRelationship((java.lang.Long) (-1L), (java.lang.Long) 1L);
        relationship.RequirementSubjectRelationship requirementSubjectRelationship8 = new relationship.RequirementSubjectRelationship();
        basic.StudentEntity studentEntity14 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long15 = studentEntity14.getCourse();
        functional.view.StudentView studentView16 = new functional.view.StudentView(studentEntity14);
        boolean boolean17 = requirementSubjectRelationship8.equals((java.lang.Object) studentView16);
        basic.StudentEntity studentEntity23 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView24 = new functional.view.StudentView(studentEntity23);
        basic.StudentEntity studentEntity25 = studentView24.getStudentEntity();
        java.lang.Long long26 = studentEntity25.getCourse();
        java.lang.String str27 = studentEntity25.getRegistration();
        boolean boolean28 = studentEntity25.validation();
        studentView16.setStudentEntity(studentEntity25);
        boolean boolean30 = approvedRelationship7.equals((java.lang.Object) studentView16);
        boolean boolean31 = teacherEntity2.equals((java.lang.Object) approvedRelationship7);
        approvedRelationship7.setStudent((java.lang.Long) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        relationship.filter.ApprovedFilter approvedFilter0 = new relationship.filter.ApprovedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long2 = approvedFilter0.creditFromStudent((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.lang.Long long4 = courseEntity3.getDepartment();
        java.lang.String str5 = courseEntity3.getName();
        basic.SubjectEntity subjectEntity15 = new basic.SubjectEntity("", "", (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Integer) 0, (java.lang.Boolean) true, (java.lang.Long) 1L, (java.lang.Long) 100L, "");
        boolean boolean16 = courseEntity3.equals((java.lang.Object) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        relationship.filter.RequirementCreditFilter requirementCreditFilter0 = new relationship.filter.RequirementCreditFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = requirementCreditFilter0.canEnroll((java.lang.Long) (-1L), (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        relationship.RequirementCreditRelationship requirementCreditRelationship2 = new relationship.RequirementCreditRelationship((java.lang.Long) 1L, (java.lang.Long) 10L);
        requirementCreditRelationship2.setCredit((java.lang.Long) 1L);
        requirementCreditRelationship2.setSubject((java.lang.Long) 10L);
        java.lang.Long long7 = requirementCreditRelationship2.getCredit();
        basic.SecretaryEntity secretaryEntity8 = new basic.SecretaryEntity();
        secretaryEntity8.setDepartment((java.lang.Long) (-1L));
        java.lang.Long long11 = secretaryEntity8.getLevel();
        boolean boolean12 = requirementCreditRelationship2.equals((java.lang.Object) long11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        java.lang.Long long10 = subjectEntity9.getCourse();
        subjectEntity9.setId((long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10.equals(1L));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.String str6 = studentEntity5.getRegistration();
        basic.SubjectEntity subjectEntity16 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        java.lang.Long long17 = subjectEntity16.getResponsibleTeacher();
        boolean boolean18 = subjectEntity16.isNull();
        subjectEntity16.setCourse((java.lang.Long) (-1L));
        boolean boolean21 = studentEntity5.equals((java.lang.Object) subjectEntity16);
        subjectEntity16.setBinding((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        relationship.filter.MatriculateFilter matriculateFilter0 = new relationship.filter.MatriculateFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<relationship.MatriculateRelationship> matriculateRelationshipList2 = matriculateFilter0.studentMatriculateFrom((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        java.lang.String str10 = subjectEntity9.getDescription();
        boolean boolean11 = subjectEntity9.isNull();
        java.lang.String str12 = subjectEntity9.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 100L, (java.lang.Long) 10L, (java.lang.Integer) (-1), (java.lang.Boolean) false, (java.lang.Long) 10L, (java.lang.Long) 0L, "");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        boolean boolean5 = courseEntity3.validation();
        courseEntity3.setId((long) (short) 0);
        relationship.RequirementSubjectRelationship requirementSubjectRelationship8 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship8.setSubject((java.lang.Long) 0L);
        requirementSubjectRelationship8.setParent((java.lang.Long) 10L);
        requirementSubjectRelationship8.setSubject((java.lang.Long) 100L);
        requirementSubjectRelationship8.setId(10L);
        boolean boolean17 = courseEntity3.equals((java.lang.Object) requirementSubjectRelationship8);
        long long18 = requirementSubjectRelationship8.getId();
        requirementSubjectRelationship8.setSubject((java.lang.Long) 0L);
        java.lang.Long long21 = requirementSubjectRelationship8.getSubject();
        java.lang.Long long22 = requirementSubjectRelationship8.getSubject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22.equals(0L));
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        basic.SubjectEntity subjectEntity0 = new basic.SubjectEntity();
        subjectEntity0.setCredit((java.lang.Long) 100L);
        subjectEntity0.setCredit((java.lang.Long) 10L);
        java.lang.Long long5 = subjectEntity0.getCourse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        relationship.filter.RequirementSubjectFilter requirementSubjectFilter0 = new relationship.filter.RequirementSubjectFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<relationship.RequirementSubjectRelationship> requirementSubjectRelationshipList2 = requirementSubjectFilter0.fromSubject((java.lang.Long) 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long6 = studentEntity5.getCourse();
        java.lang.Long long7 = studentEntity5.getLevel();
        java.lang.String str8 = studentEntity5.getRegistration();
        studentEntity5.setName("");
        java.lang.String str11 = studentEntity5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        relationship.filter.RequirementCreditFilter requirementCreditFilter0 = new relationship.filter.RequirementCreditFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = requirementCreditFilter0.canEnroll((java.lang.Long) 1L, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.String str6 = studentEntity5.getName();
        studentEntity5.setName("");
        long long9 = studentEntity5.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        java.lang.Long long10 = subjectEntity9.getCourse();
        java.lang.String str11 = subjectEntity9.getCode();
        subjectEntity9.setDescription("hi!");
        java.lang.String str14 = subjectEntity9.getCode();
        java.lang.Long long15 = subjectEntity9.getLevel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15.equals(1L));
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        functional.view.SubjectView subjectView0 = new functional.view.SubjectView();
        basic.SubjectEntity subjectEntity1 = subjectView0.getSubjectEntity();
        basic.SubjectEntity subjectEntity2 = new basic.SubjectEntity();
        subjectView0.setSubjectEntity(subjectEntity2);
        basic.SubjectEntity subjectEntity4 = subjectView0.getSubjectEntity();
        basic.TeacherEntity teacherEntity5 = new basic.TeacherEntity();
        java.lang.String str6 = teacherEntity5.getName();
        java.lang.Long long7 = teacherEntity5.getDepartment();
        boolean boolean8 = subjectEntity4.equals((java.lang.Object) teacherEntity5);
        boolean boolean9 = teacherEntity5.validation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntity1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(subjectEntity4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        basic.CourseEntity courseEntity0 = new basic.CourseEntity();
        java.lang.Long long1 = courseEntity0.getLevel();
        basic.DepartmentEntity departmentEntity4 = new basic.DepartmentEntity("", (java.lang.Long) 100L);
        boolean boolean5 = courseEntity0.equals((java.lang.Object) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        relationship.MatriculateRelationship matriculateRelationship2 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) (-1L));
        matriculateRelationship2.setSubject((java.lang.Long) (-1L));
        java.lang.Long long5 = matriculateRelationship2.getStudent();
        long long6 = matriculateRelationship2.getId();
        matriculateRelationship2.setStudent((java.lang.Long) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        relationship.RequirementCreditRelationship requirementCreditRelationship2 = new relationship.RequirementCreditRelationship((java.lang.Long) 1L, (java.lang.Long) 10L);
        requirementCreditRelationship2.setId((long) (short) 100);
        requirementCreditRelationship2.setCredit((java.lang.Long) 0L);
        functional.view.SecretaryView secretaryView7 = new functional.view.SecretaryView();
        basic.SecretaryEntity secretaryEntity11 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity11.setName("");
        secretaryView7.setSecretaryEntity(secretaryEntity11);
        basic.SecretaryEntity secretaryEntity15 = new basic.SecretaryEntity();
        secretaryEntity15.setLevel((java.lang.Long) 10L);
        secretaryView7.setSecretaryEntity(secretaryEntity15);
        boolean boolean19 = requirementCreditRelationship2.equals((java.lang.Object) secretaryView7);
        java.lang.Class<?> wildcardClass20 = requirementCreditRelationship2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 100L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 0L, (java.lang.Long) 100L, (java.lang.Integer) (-1), (java.lang.Boolean) false, (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        boolean boolean10 = subjectEntity9.isNull();
        basic.StudentEntity studentEntity16 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        boolean boolean17 = subjectEntity9.equals((java.lang.Object) "");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship18 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship18.setSubject((java.lang.Long) 0L);
        boolean boolean21 = subjectEntity9.equals((java.lang.Object) 0L);
        subjectEntity9.setDescription("hi!");
        subjectEntity9.setBinding((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView6 = new functional.view.StudentView(studentEntity5);
        basic.StudentEntity studentEntity7 = studentView6.getStudentEntity();
        basic.StudentEntity studentEntity8 = studentView6.getStudentEntity();
        basic.StudentEntity studentEntity9 = studentView6.getStudentEntity();
        basic.StudentEntity studentEntity15 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long16 = studentEntity15.getCourse();
        functional.view.StudentView studentView17 = new functional.view.StudentView(studentEntity15);
        studentView6.setStudentEntity(studentEntity15);
        studentEntity15.setLevel((java.lang.Long) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16.equals(10L));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship0 = new relationship.RequirementSubjectRelationship();
        basic.StudentEntity studentEntity6 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long7 = studentEntity6.getCourse();
        functional.view.StudentView studentView8 = new functional.view.StudentView(studentEntity6);
        boolean boolean9 = requirementSubjectRelationship0.equals((java.lang.Object) studentView8);
        basic.StudentEntity studentEntity15 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView16 = new functional.view.StudentView(studentEntity15);
        basic.StudentEntity studentEntity17 = studentView16.getStudentEntity();
        java.lang.Long long18 = studentEntity17.getCourse();
        java.lang.String str19 = studentEntity17.getRegistration();
        boolean boolean20 = studentEntity17.validation();
        studentView8.setStudentEntity(studentEntity17);
        basic.StudentEntity studentEntity27 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView28 = new functional.view.StudentView(studentEntity27);
        studentEntity27.setId((long) 1);
        functional.view.StudentView studentView31 = new functional.view.StudentView(studentEntity27);
        studentEntity27.setCourse((java.lang.Long) 1L);
        studentView8.setStudentEntity(studentEntity27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        relationship.MatriculateRelationship matriculateRelationship2 = new relationship.MatriculateRelationship((java.lang.Long) 1L, (java.lang.Long) (-1L));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        basic.TeacherEntity teacherEntity0 = new basic.TeacherEntity();
        boolean boolean1 = teacherEntity0.validation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        relationship.filter.RequirementSubjectFilter requirementSubjectFilter0 = new relationship.filter.RequirementSubjectFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = requirementSubjectFilter0.canEnroll((java.lang.Long) 32L, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        relationship.OfferedRelationship offeredRelationship2 = new relationship.OfferedRelationship((java.lang.Long) 100L, (java.lang.Long) 10L);
        offeredRelationship2.setId(1L);
        offeredRelationship2.setCourse((java.lang.Long) 1L);
        basic.SecretaryEntity secretaryEntity10 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity10.setName("");
        secretaryEntity10.setName("");
        secretaryEntity10.setName("");
        secretaryEntity10.setName("");
        long long19 = secretaryEntity10.getId();
        boolean boolean20 = offeredRelationship2.equals((java.lang.Object) secretaryEntity10);
        secretaryEntity10.setId((long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        basic.TeacherEntity teacherEntity0 = new basic.TeacherEntity();
        java.lang.String str1 = teacherEntity0.getName();
        teacherEntity0.setName("");
        long long4 = teacherEntity0.getId();
        boolean boolean5 = teacherEntity0.validation();
        boolean boolean6 = teacherEntity0.validation();
        long long7 = teacherEntity0.getId();
        teacherEntity0.setName("");
        long long10 = teacherEntity0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView6 = new functional.view.StudentView(studentEntity5);
        studentEntity5.setCourse((java.lang.Long) 0L);
        functional.view.StudentView studentView9 = new functional.view.StudentView(studentEntity5);
        java.lang.Class<?> wildcardClass10 = studentView9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        relationship.RequirementCreditRelationship requirementCreditRelationship2 = new relationship.RequirementCreditRelationship((java.lang.Long) 10L, (java.lang.Long) 10L);
        requirementCreditRelationship2.setSubject((java.lang.Long) 32L);
        requirementCreditRelationship2.setId(0L);
        requirementCreditRelationship2.setCredit((java.lang.Long) 100L);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship0 = new relationship.RequirementSubjectRelationship();
        basic.StudentEntity studentEntity6 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long7 = studentEntity6.getCourse();
        functional.view.StudentView studentView8 = new functional.view.StudentView(studentEntity6);
        boolean boolean9 = requirementSubjectRelationship0.equals((java.lang.Object) studentView8);
        basic.StudentEntity studentEntity15 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView16 = new functional.view.StudentView(studentEntity15);
        basic.StudentEntity studentEntity17 = studentView16.getStudentEntity();
        java.lang.Long long18 = studentEntity17.getCourse();
        java.lang.String str19 = studentEntity17.getRegistration();
        boolean boolean20 = studentEntity17.validation();
        studentView8.setStudentEntity(studentEntity17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = studentView8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        functional.view.SecretaryView secretaryView0 = new functional.view.SecretaryView();
        basic.SecretaryEntity secretaryEntity4 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity4.setLevel((java.lang.Long) 0L);
        secretaryView0.setSecretaryEntity(secretaryEntity4);
        basic.SecretaryEntity secretaryEntity11 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity11.setName("");
        secretaryEntity11.setName("");
        secretaryEntity11.setName("");
        java.lang.String str18 = secretaryEntity11.getName();
        secretaryEntity11.setLevel((java.lang.Long) 0L);
        secretaryView0.setSecretaryEntity(secretaryEntity11);
        basic.SecretaryEntity secretaryEntity25 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity25.setName("");
        secretaryEntity25.setName("");
        secretaryEntity25.setName("hi!");
        secretaryView0.setSecretaryEntity(secretaryEntity25);
        secretaryEntity25.setDepartment((java.lang.Long) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        basic.TeacherEntity teacherEntity2 = new basic.TeacherEntity("", (java.lang.Long) (-1L));
        teacherEntity2.setId(0L);
        relationship.ApprovedRelationship approvedRelationship7 = new relationship.ApprovedRelationship((java.lang.Long) (-1L), (java.lang.Long) 1L);
        relationship.RequirementSubjectRelationship requirementSubjectRelationship8 = new relationship.RequirementSubjectRelationship();
        basic.StudentEntity studentEntity14 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long15 = studentEntity14.getCourse();
        functional.view.StudentView studentView16 = new functional.view.StudentView(studentEntity14);
        boolean boolean17 = requirementSubjectRelationship8.equals((java.lang.Object) studentView16);
        basic.StudentEntity studentEntity23 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView24 = new functional.view.StudentView(studentEntity23);
        basic.StudentEntity studentEntity25 = studentView24.getStudentEntity();
        java.lang.Long long26 = studentEntity25.getCourse();
        java.lang.String str27 = studentEntity25.getRegistration();
        boolean boolean28 = studentEntity25.validation();
        studentView16.setStudentEntity(studentEntity25);
        boolean boolean30 = approvedRelationship7.equals((java.lang.Object) studentView16);
        boolean boolean31 = teacherEntity2.equals((java.lang.Object) approvedRelationship7);
        approvedRelationship7.setId((java.lang.Long) 32L);
        java.lang.Long long34 = approvedRelationship7.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34.equals(32L));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        relationship.RequirementCreditRelationship requirementCreditRelationship2 = new relationship.RequirementCreditRelationship((java.lang.Long) 1L, (java.lang.Long) 10L);
        requirementCreditRelationship2.setCredit((java.lang.Long) 1L);
        requirementCreditRelationship2.setSubject((java.lang.Long) 10L);
        java.lang.Long long7 = requirementCreditRelationship2.getSubject();
        requirementCreditRelationship2.setSubject((java.lang.Long) (-1L));
        relationship.ApprovedRelationship approvedRelationship12 = new relationship.ApprovedRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        approvedRelationship12.setId((java.lang.Long) 10L);
        boolean boolean15 = requirementCreditRelationship2.equals((java.lang.Object) approvedRelationship12);
        requirementCreditRelationship2.setCredit((java.lang.Long) 1L);
        java.lang.Long long18 = requirementCreditRelationship2.getCredit();
        long long19 = requirementCreditRelationship2.getId();
        java.lang.Long long20 = requirementCreditRelationship2.getCredit();
        java.lang.Long long21 = requirementCreditRelationship2.getCredit();
        long long22 = requirementCreditRelationship2.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        basic.DepartmentEntity departmentEntity2 = new basic.DepartmentEntity("", (java.lang.Long) 100L);
        boolean boolean3 = departmentEntity2.validation();
        java.lang.String str4 = departmentEntity2.getName();
        java.lang.String str5 = departmentEntity2.getName();
        java.lang.Long long6 = departmentEntity2.getResponsible();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6.equals(100L));
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long6 = studentEntity5.getCourse();
        functional.view.StudentView studentView7 = new functional.view.StudentView(studentEntity5);
        functional.view.SubjectView subjectView8 = new functional.view.SubjectView();
        basic.SubjectEntity subjectEntity9 = subjectView8.getSubjectEntity();
        basic.SubjectEntity subjectEntity10 = new basic.SubjectEntity();
        subjectView8.setSubjectEntity(subjectEntity10);
        boolean boolean12 = studentEntity5.equals((java.lang.Object) subjectView8);
        basic.SubjectEntity subjectEntity13 = subjectView8.getSubjectEntity();
        java.lang.Long long14 = subjectEntity13.getResponsibleTeacher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntity9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(subjectEntity13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long14);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        relationship.OfferedRelationship offeredRelationship2 = new relationship.OfferedRelationship((java.lang.Long) 100L, (java.lang.Long) 10L);
        offeredRelationship2.setId(1L);
        offeredRelationship2.setSubject((java.lang.Long) 0L);
        basic.SubjectEntity subjectEntity16 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity16.setDescription("");
        boolean boolean19 = subjectEntity16.validation();
        subjectEntity16.setWorkload((java.lang.Integer) 100);
        subjectEntity16.setCredit((java.lang.Long) (-1L));
        boolean boolean24 = offeredRelationship2.equals((java.lang.Object) subjectEntity16);
        java.lang.String str25 = subjectEntity16.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView6 = new functional.view.StudentView(studentEntity5);
        studentEntity5.setId((long) 1);
        functional.view.StudentView studentView9 = new functional.view.StudentView(studentEntity5);
        functional.view.StudentView studentView10 = new functional.view.StudentView(studentEntity5);
        basic.StudentEntity studentEntity16 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.String str17 = studentEntity16.getRegistration();
        studentEntity16.setCourse((java.lang.Long) (-1L));
        java.lang.Long long20 = studentEntity16.getCourse();
        studentView10.setStudentEntity(studentEntity16);
        basic.StudentEntity studentEntity22 = studentView10.getStudentEntity();
        java.lang.String str23 = studentEntity22.getRegistration();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        relationship.filter.RequirementSubjectFilter requirementSubjectFilter0 = new relationship.filter.RequirementSubjectFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<relationship.RequirementSubjectRelationship> requirementSubjectRelationshipList2 = requirementSubjectFilter0.fromSubject((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity3.setName("");
        secretaryEntity3.setName("");
        secretaryEntity3.setName("hi!");
        java.lang.String str10 = secretaryEntity3.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        relationship.RequirementCreditRelationship requirementCreditRelationship2 = new relationship.RequirementCreditRelationship((java.lang.Long) 32L, (java.lang.Long) 100L);
        java.lang.Long long3 = requirementCreditRelationship2.getCredit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3.equals(32L));
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        relationship.RequirementCreditRelationship requirementCreditRelationship2 = new relationship.RequirementCreditRelationship((java.lang.Long) 10L, (java.lang.Long) 10L);
        java.lang.Long long3 = requirementCreditRelationship2.getCredit();
        java.lang.Long long4 = requirementCreditRelationship2.getCredit();
        requirementCreditRelationship2.setId((long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4.equals(10L));
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        basic.SubjectEntity subjectEntity0 = new basic.SubjectEntity();
        java.lang.Long long1 = subjectEntity0.getResponsibleTeacher();
        long long2 = subjectEntity0.getId();
        java.lang.String str3 = subjectEntity0.getCode();
        java.lang.Boolean boolean4 = subjectEntity0.getBinding();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView6 = new functional.view.StudentView(studentEntity5);
        basic.StudentEntity studentEntity7 = studentView6.getStudentEntity();
        basic.StudentEntity studentEntity8 = studentView6.getStudentEntity();
        basic.StudentEntity studentEntity9 = studentView6.getStudentEntity();
        java.lang.String str10 = studentEntity9.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        relationship.OfferedRelationship offeredRelationship2 = new relationship.OfferedRelationship((java.lang.Long) 100L, (java.lang.Long) 10L);
        offeredRelationship2.setId(1L);
        offeredRelationship2.setSubject((java.lang.Long) 0L);
        java.lang.Long long7 = offeredRelationship2.getCourse();
        relationship.RequirementCreditRelationship requirementCreditRelationship10 = new relationship.RequirementCreditRelationship((java.lang.Long) 1L, (java.lang.Long) 10L);
        requirementCreditRelationship10.setCredit((java.lang.Long) 1L);
        requirementCreditRelationship10.setSubject((java.lang.Long) 10L);
        java.lang.Long long15 = requirementCreditRelationship10.getSubject();
        requirementCreditRelationship10.setSubject((java.lang.Long) (-1L));
        boolean boolean18 = offeredRelationship2.equals((java.lang.Object) requirementCreditRelationship10);
        offeredRelationship2.setSubject((java.lang.Long) 100L);
        long long21 = offeredRelationship2.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long6 = studentEntity5.getCourse();
        java.lang.Long long7 = studentEntity5.getLevel();
        long long8 = studentEntity5.getId();
        studentEntity5.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView6 = new functional.view.StudentView(studentEntity5);
        studentEntity5.setCourse((java.lang.Long) 0L);
        functional.view.StudentView studentView9 = new functional.view.StudentView(studentEntity5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentView9.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        relationship.OfferedRelationship offeredRelationship2 = new relationship.OfferedRelationship((java.lang.Long) 100L, (java.lang.Long) 10L);
        java.lang.Long long3 = offeredRelationship2.getSubject();
        offeredRelationship2.setSubject((java.lang.Long) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3.equals(10L));
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList3 = offeredFilter0.fromDepartmentToStudent((java.lang.Long) 1L, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        relationship.RequirementCreditRelationship requirementCreditRelationship2 = new relationship.RequirementCreditRelationship((java.lang.Long) 1L, (java.lang.Long) 10L);
        requirementCreditRelationship2.setCredit((java.lang.Long) 1L);
        requirementCreditRelationship2.setSubject((java.lang.Long) 10L);
        java.lang.Long long7 = requirementCreditRelationship2.getSubject();
        requirementCreditRelationship2.setSubject((java.lang.Long) (-1L));
        java.lang.Long long10 = requirementCreditRelationship2.getSubject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10.equals((-1L)));
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        boolean boolean5 = courseEntity3.validation();
        courseEntity3.setId((long) (short) 0);
        relationship.RequirementSubjectRelationship requirementSubjectRelationship8 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship8.setSubject((java.lang.Long) 0L);
        requirementSubjectRelationship8.setParent((java.lang.Long) 10L);
        requirementSubjectRelationship8.setSubject((java.lang.Long) 100L);
        requirementSubjectRelationship8.setId(10L);
        boolean boolean17 = courseEntity3.equals((java.lang.Object) requirementSubjectRelationship8);
        courseEntity3.setDepartment((java.lang.Long) 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        basic.TeacherEntity teacherEntity0 = new basic.TeacherEntity();
        java.lang.String str1 = teacherEntity0.getName();
        teacherEntity0.setName("");
        long long4 = teacherEntity0.getId();
        teacherEntity0.setDepartment((java.lang.Long) 10L);
        teacherEntity0.setName("hi!");
        teacherEntity0.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList3 = offeredFilter0.fromCourseToStudent((java.lang.Long) (-1L), (java.lang.Long) 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        basic.DepartmentEntity departmentEntity0 = new basic.DepartmentEntity();
        boolean boolean2 = departmentEntity0.equals((java.lang.Object) 1L);
        java.lang.String str3 = departmentEntity0.getName();
        java.lang.Long long4 = departmentEntity0.getResponsible();
        java.lang.Long long5 = departmentEntity0.getResponsible();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        basic.TeacherEntity teacherEntity2 = new basic.TeacherEntity("", (java.lang.Long) (-1L));
        teacherEntity2.setId(0L);
        basic.SubjectEntity subjectEntity14 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 0L, (java.lang.Long) 100L, (java.lang.Integer) (-1), (java.lang.Boolean) false, (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        boolean boolean15 = subjectEntity14.isNull();
        basic.StudentEntity studentEntity21 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        boolean boolean22 = subjectEntity14.equals((java.lang.Object) "");
        boolean boolean23 = teacherEntity2.equals((java.lang.Object) boolean22);
        java.lang.Object obj24 = null;
        boolean boolean25 = teacherEntity2.equals(obj24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        relationship.filter.MatriculateFilter matriculateFilter0 = new relationship.filter.MatriculateFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<relationship.MatriculateRelationship> matriculateRelationshipList2 = matriculateFilter0.studentMatriculateFrom((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView6 = new functional.view.StudentView(studentEntity5);
        basic.StudentEntity studentEntity7 = studentView6.getStudentEntity();
        basic.StudentEntity studentEntity8 = studentView6.getStudentEntity();
        basic.StudentEntity studentEntity9 = studentView6.getStudentEntity();
        basic.StudentEntity studentEntity15 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long16 = studentEntity15.getCourse();
        functional.view.StudentView studentView17 = new functional.view.StudentView(studentEntity15);
        studentView6.setStudentEntity(studentEntity15);
        basic.StudentEntity studentEntity19 = studentView6.getStudentEntity();
        studentEntity19.setCourse((java.lang.Long) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity19);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        functional.Matriculation matriculation0 = new functional.Matriculation();
        java.lang.Boolean boolean1 = matriculation0.doMatriculation();
        basic.SubjectEntity subjectEntity11 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity11.setDescription("");
        subjectEntity11.setWorkload((java.lang.Integer) 100);
        basic.StudentEntity studentEntity21 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView22 = new functional.view.StudentView(studentEntity21);
        basic.StudentEntity studentEntity23 = studentView22.getStudentEntity();
        basic.StudentEntity studentEntity24 = studentView22.getStudentEntity();
        basic.StudentEntity studentEntity25 = studentView22.getStudentEntity();
        boolean boolean26 = subjectEntity11.equals((java.lang.Object) studentEntity25);
        matriculation0.setSelectedStudent(studentEntity25);
        dao.StudentDao studentDao28 = matriculation0.getStudentDao();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao28);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList3 = offeredFilter0.fromDepartmentToStudent((java.lang.Long) 32L, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        basic.SubjectEntity subjectEntity0 = new basic.SubjectEntity();
        java.lang.Boolean boolean1 = subjectEntity0.getBinding();
        java.lang.String str2 = subjectEntity0.getName();
        subjectEntity0.setLevel((java.lang.Long) (-1L));
        java.lang.Long long5 = subjectEntity0.getCredit();
        java.lang.Long long6 = subjectEntity0.getResponsibleTeacher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        functional.view.SecretaryView secretaryView0 = new functional.view.SecretaryView();
        basic.SecretaryEntity secretaryEntity4 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity4.setName("");
        secretaryView0.setSecretaryEntity(secretaryEntity4);
        basic.SecretaryEntity secretaryEntity8 = new basic.SecretaryEntity();
        secretaryEntity8.setLevel((java.lang.Long) 10L);
        secretaryView0.setSecretaryEntity(secretaryEntity8);
        secretaryEntity8.setId((long) 0);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship0 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship0.setSubject((java.lang.Long) 0L);
        boolean boolean4 = requirementSubjectRelationship0.equals((java.lang.Object) (short) -1);
        long long5 = requirementSubjectRelationship0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        relationship.filter.RequirementCreditFilter requirementCreditFilter0 = new relationship.filter.RequirementCreditFilter();
        // The following exception was thrown during execution in test generation
        try {
            relationship.RequirementCreditRelationship requirementCreditRelationship2 = requirementCreditFilter0.fromSubject((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        basic.DepartmentEntity departmentEntity0 = new basic.DepartmentEntity();
        long long1 = departmentEntity0.getId();
        departmentEntity0.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList3 = offeredFilter0.fromCourseToStudent((java.lang.Long) 100L, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship2 = new relationship.RequirementSubjectRelationship((java.lang.Long) 0L, (java.lang.Long) 32L);
        basic.SubjectEntity subjectEntity12 = new basic.SubjectEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 100L, (java.lang.Integer) 10, (java.lang.Boolean) false, (java.lang.Long) (-1L), (java.lang.Long) 100L, "");
        boolean boolean13 = requirementSubjectRelationship2.equals((java.lang.Object) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        relationship.filter.RequirementSubjectFilter requirementSubjectFilter0 = new relationship.filter.RequirementSubjectFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = requirementSubjectFilter0.canEnroll((java.lang.Long) 1L, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        basic.TeacherEntity teacherEntity2 = new basic.TeacherEntity("", (java.lang.Long) (-1L));
        teacherEntity2.setId(0L);
        relationship.ApprovedRelationship approvedRelationship7 = new relationship.ApprovedRelationship((java.lang.Long) (-1L), (java.lang.Long) 1L);
        relationship.RequirementSubjectRelationship requirementSubjectRelationship8 = new relationship.RequirementSubjectRelationship();
        basic.StudentEntity studentEntity14 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long15 = studentEntity14.getCourse();
        functional.view.StudentView studentView16 = new functional.view.StudentView(studentEntity14);
        boolean boolean17 = requirementSubjectRelationship8.equals((java.lang.Object) studentView16);
        basic.StudentEntity studentEntity23 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView24 = new functional.view.StudentView(studentEntity23);
        basic.StudentEntity studentEntity25 = studentView24.getStudentEntity();
        java.lang.Long long26 = studentEntity25.getCourse();
        java.lang.String str27 = studentEntity25.getRegistration();
        boolean boolean28 = studentEntity25.validation();
        studentView16.setStudentEntity(studentEntity25);
        boolean boolean30 = approvedRelationship7.equals((java.lang.Object) studentView16);
        boolean boolean31 = teacherEntity2.equals((java.lang.Object) approvedRelationship7);
        teacherEntity2.setId((long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship0 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship0.setSubject((java.lang.Long) 0L);
        requirementSubjectRelationship0.setParent((java.lang.Long) 10L);
        requirementSubjectRelationship0.setSubject((java.lang.Long) 100L);
        java.lang.Long long7 = requirementSubjectRelationship0.getParent();
        relationship.MatriculateRelationship matriculateRelationship10 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        long long11 = matriculateRelationship10.getId();
        boolean boolean12 = requirementSubjectRelationship0.equals((java.lang.Object) matriculateRelationship10);
        java.lang.Long long13 = requirementSubjectRelationship0.getParent();
        requirementSubjectRelationship0.setParent((java.lang.Long) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13.equals(10L));
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        basic.DepartmentEntity departmentEntity0 = new basic.DepartmentEntity();
        boolean boolean2 = departmentEntity0.equals((java.lang.Object) 1L);
        departmentEntity0.setName("");
        departmentEntity0.setName("hi!");
        boolean boolean8 = departmentEntity0.equals((java.lang.Object) (byte) -1);
        departmentEntity0.setName("hi!");
        java.lang.String str11 = departmentEntity0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        relationship.MatriculateRelationship matriculateRelationship2 = new relationship.MatriculateRelationship((java.lang.Long) 0L, (java.lang.Long) 0L);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        basic.TeacherEntity teacherEntity0 = new basic.TeacherEntity();
        teacherEntity0.setId((long) 10);
        teacherEntity0.setName("hi!");
        teacherEntity0.setDepartment((java.lang.Long) 10L);
        long long7 = teacherEntity0.getId();
        long long8 = teacherEntity0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        basic.DepartmentEntity departmentEntity2 = new basic.DepartmentEntity("", (java.lang.Long) 100L);
        boolean boolean3 = departmentEntity2.validation();
        java.lang.Long long4 = departmentEntity2.getResponsible();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4.equals(100L));
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        relationship.RequirementCreditRelationship requirementCreditRelationship2 = new relationship.RequirementCreditRelationship((java.lang.Long) 1L, (java.lang.Long) 10L);
        requirementCreditRelationship2.setId((long) (short) 100);
        requirementCreditRelationship2.setCredit((java.lang.Long) 10L);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        relationship.OfferedRelationship offeredRelationship2 = new relationship.OfferedRelationship((java.lang.Long) 0L, (java.lang.Long) 1L);
        basic.SubjectEntity subjectEntity12 = new basic.SubjectEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 100L, (java.lang.Integer) 10, (java.lang.Boolean) false, (java.lang.Long) (-1L), (java.lang.Long) 100L, "");
        subjectEntity12.setBinding((java.lang.Boolean) false);
        boolean boolean15 = offeredRelationship2.equals((java.lang.Object) subjectEntity12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        relationship.filter.ApprovedFilter approvedFilter0 = new relationship.filter.ApprovedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList2 = approvedFilter0.approvalsFromStudent((java.lang.Long) 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        basic.StudentEntity studentEntity0 = new basic.StudentEntity();
        java.lang.Long long1 = studentEntity0.getCourse();
        studentEntity0.setCourse((java.lang.Long) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        java.lang.Long long10 = subjectEntity9.getResponsibleTeacher();
        boolean boolean11 = subjectEntity9.isNull();
        java.lang.Long long12 = subjectEntity9.getLevel();
        java.lang.Long long13 = subjectEntity9.getResponsibleTeacher();
        java.lang.String str14 = subjectEntity9.getCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList3 = offeredFilter0.fromCourseToStudent((java.lang.Long) 10L, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship2 = new relationship.RequirementSubjectRelationship((java.lang.Long) 0L, (java.lang.Long) 1L);
        java.lang.Long long3 = requirementSubjectRelationship2.getParent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3.equals(0L));
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship0 = new relationship.RequirementSubjectRelationship();
        long long1 = requirementSubjectRelationship0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        relationship.RequirementCreditRelationship requirementCreditRelationship2 = new relationship.RequirementCreditRelationship((java.lang.Long) 1L, (java.lang.Long) 10L);
        java.lang.Long long3 = requirementCreditRelationship2.getCredit();
        long long4 = requirementCreditRelationship2.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.String str6 = studentEntity5.getRegistration();
        studentEntity5.setCourse((java.lang.Long) (-1L));
        java.lang.Long long9 = studentEntity5.getCourse();
        functional.view.StudentView studentView10 = new functional.view.StudentView(studentEntity5);
        basic.StudentEntity studentEntity16 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long17 = studentEntity16.getCourse();
        java.lang.Long long18 = studentEntity16.getLevel();
        studentView10.setStudentEntity(studentEntity16);
        java.lang.Object obj20 = null;
        boolean boolean21 = studentEntity16.equals(obj20);
        long long22 = studentEntity16.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        basic.TeacherEntity teacherEntity2 = new basic.TeacherEntity("", (java.lang.Long) (-1L));
        teacherEntity2.setId(0L);
        teacherEntity2.setId(0L);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        basic.TeacherEntity teacherEntity0 = new basic.TeacherEntity();
        java.lang.String str1 = teacherEntity0.getName();
        java.lang.String str2 = teacherEntity0.getName();
        teacherEntity0.setDepartment((java.lang.Long) 0L);
        basic.StudentEntity studentEntity10 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView11 = new functional.view.StudentView(studentEntity10);
        java.lang.Long long12 = studentEntity10.getLevel();
        java.lang.Class<?> wildcardClass13 = studentEntity10.getClass();
        boolean boolean14 = teacherEntity0.equals((java.lang.Object) studentEntity10);
        relationship.ApprovedRelationship approvedRelationship17 = new relationship.ApprovedRelationship((java.lang.Long) (-1L), (java.lang.Long) 0L);
        java.lang.Long long18 = approvedRelationship17.getStudent();
        approvedRelationship17.setSubject((java.lang.Long) 0L);
        boolean boolean21 = teacherEntity0.equals((java.lang.Object) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        relationship.ApprovedRelationship approvedRelationship2 = new relationship.ApprovedRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        relationship.ApprovedRelationship approvedRelationship5 = new relationship.ApprovedRelationship((java.lang.Long) (-1L), (java.lang.Long) 1L);
        boolean boolean6 = approvedRelationship2.equals((java.lang.Object) (-1L));
        approvedRelationship2.setStudent((java.lang.Long) 1L);
        java.lang.Long long9 = approvedRelationship2.getId();
        basic.CourseEntity courseEntity13 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long14 = courseEntity13.getId();
        boolean boolean15 = courseEntity13.validation();
        courseEntity13.setId((long) (short) 0);
        relationship.MatriculateRelationship matriculateRelationship20 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        long long21 = matriculateRelationship20.getId();
        matriculateRelationship20.setStudent((java.lang.Long) 10L);
        boolean boolean24 = courseEntity13.equals((java.lang.Object) 10L);
        courseEntity13.setDepartment((java.lang.Long) 0L);
        functional.Matriculation matriculation27 = new functional.Matriculation();
        dao.StudentDao studentDao28 = matriculation27.getStudentDao();
        boolean boolean29 = courseEntity13.equals((java.lang.Object) matriculation27);
        dao.StudentDao studentDao30 = matriculation27.getStudentDao();
        java.util.List<basic.SubjectEntity> subjectEntityList31 = matriculation27.getOffer();
        boolean boolean32 = approvedRelationship2.equals((java.lang.Object) subjectEntityList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntityList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        functional.Matriculation matriculation0 = new functional.Matriculation();
        java.lang.Boolean boolean1 = matriculation0.doMatriculation();
        java.lang.Boolean boolean2 = matriculation0.doMatriculation();
        java.util.List<basic.StudentEntity> studentEntityList3 = matriculation0.getStudentAvailable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntityList3);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        functional.view.SubjectView subjectView0 = new functional.view.SubjectView();
        java.lang.String str1 = subjectView0.toString();
        java.lang.String str2 = subjectView0.toString();
        basic.SubjectEntity subjectEntity3 = subjectView0.getSubjectEntity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntity3);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long6 = studentEntity5.getCourse();
        java.lang.Long long7 = studentEntity5.getLevel();
        long long8 = studentEntity5.getId();
        java.lang.Long long9 = studentEntity5.getLevel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9.equals(1L));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        basic.DepartmentEntity departmentEntity0 = new basic.DepartmentEntity();
        boolean boolean2 = departmentEntity0.equals((java.lang.Object) 1L);
        boolean boolean3 = departmentEntity0.validation();
        boolean boolean4 = departmentEntity0.validation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity3.setName("");
        java.lang.String str6 = secretaryEntity3.getName();
        boolean boolean7 = secretaryEntity3.validation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        relationship.ApprovedRelationship approvedRelationship2 = new relationship.ApprovedRelationship((java.lang.Long) (-1L), (java.lang.Long) 0L);
        approvedRelationship2.setSubject((java.lang.Long) 0L);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        relationship.RequirementCreditRelationship requirementCreditRelationship2 = new relationship.RequirementCreditRelationship((java.lang.Long) 1L, (java.lang.Long) 10L);
        requirementCreditRelationship2.setId((long) (short) 100);
        requirementCreditRelationship2.setCredit((java.lang.Long) 0L);
        functional.view.SecretaryView secretaryView7 = new functional.view.SecretaryView();
        basic.SecretaryEntity secretaryEntity11 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity11.setName("");
        secretaryView7.setSecretaryEntity(secretaryEntity11);
        basic.SecretaryEntity secretaryEntity15 = new basic.SecretaryEntity();
        secretaryEntity15.setLevel((java.lang.Long) 10L);
        secretaryView7.setSecretaryEntity(secretaryEntity15);
        boolean boolean19 = requirementCreditRelationship2.equals((java.lang.Object) secretaryView7);
        requirementCreditRelationship2.setCredit((java.lang.Long) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        basic.DepartmentEntity departmentEntity2 = new basic.DepartmentEntity("hi!", (java.lang.Long) 1L);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        basic.DepartmentEntity departmentEntity2 = new basic.DepartmentEntity("", (java.lang.Long) 100L);
        departmentEntity2.setName("hi!");
        boolean boolean5 = departmentEntity2.validation();
        departmentEntity2.setId((long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 100L, (java.lang.Integer) 10, (java.lang.Boolean) false, (java.lang.Long) (-1L), (java.lang.Long) 100L, "");
        boolean boolean10 = subjectEntity9.validation();
        java.lang.String str11 = subjectEntity9.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        basic.TeacherEntity teacherEntity2 = new basic.TeacherEntity("", (java.lang.Long) 0L);
        functional.view.SecretaryView secretaryView3 = new functional.view.SecretaryView();
        basic.SecretaryEntity secretaryEntity4 = null;
        secretaryView3.setSecretaryEntity(secretaryEntity4);
        java.lang.String str6 = secretaryView3.toString();
        basic.SecretaryEntity secretaryEntity7 = secretaryView3.getSecretaryEntity();
        java.lang.String str8 = secretaryView3.toString();
        basic.SecretaryEntity secretaryEntity9 = secretaryView3.getSecretaryEntity();
        java.lang.String str10 = secretaryView3.toString();
        boolean boolean11 = teacherEntity2.equals((java.lang.Object) secretaryView3);
        java.lang.Long long12 = teacherEntity2.getDepartment();
        boolean boolean13 = teacherEntity2.validation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(secretaryEntity7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(secretaryEntity9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        relationship.OfferedRelationship offeredRelationship2 = new relationship.OfferedRelationship((java.lang.Long) 100L, (java.lang.Long) 10L);
        offeredRelationship2.setId(1L);
        offeredRelationship2.setSubject((java.lang.Long) 0L);
        java.lang.Long long7 = offeredRelationship2.getCourse();
        relationship.RequirementCreditRelationship requirementCreditRelationship10 = new relationship.RequirementCreditRelationship((java.lang.Long) 1L, (java.lang.Long) 100L);
        boolean boolean11 = offeredRelationship2.equals((java.lang.Object) 100L);
        offeredRelationship2.setCourse((java.lang.Long) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity9.setDescription("");
        subjectEntity9.setWorkload((java.lang.Integer) 100);
        basic.StudentEntity studentEntity19 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView20 = new functional.view.StudentView(studentEntity19);
        basic.StudentEntity studentEntity21 = studentView20.getStudentEntity();
        basic.StudentEntity studentEntity22 = studentView20.getStudentEntity();
        basic.StudentEntity studentEntity23 = studentView20.getStudentEntity();
        boolean boolean24 = subjectEntity9.equals((java.lang.Object) studentEntity23);
        subjectEntity9.setBinding((java.lang.Boolean) true);
        java.lang.String str27 = subjectEntity9.getName();
        subjectEntity9.setLevel((java.lang.Long) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) 10L, "hi!", (java.lang.Long) (-1L));
        relationship.filter.MatriculateFilter matriculateFilter4 = new relationship.filter.MatriculateFilter();
        boolean boolean5 = secretaryEntity3.equals((java.lang.Object) matriculateFilter4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<relationship.MatriculateRelationship> matriculateRelationshipList7 = matriculateFilter4.subjectMatriculateFrom((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView6 = new functional.view.StudentView(studentEntity5);
        basic.StudentEntity studentEntity7 = studentView6.getStudentEntity();
        basic.StudentEntity studentEntity8 = studentView6.getStudentEntity();
        basic.StudentEntity studentEntity9 = studentView6.getStudentEntity();
        basic.StudentEntity studentEntity15 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long16 = studentEntity15.getCourse();
        functional.view.StudentView studentView17 = new functional.view.StudentView(studentEntity15);
        studentView6.setStudentEntity(studentEntity15);
        studentEntity15.setCourse((java.lang.Long) 0L);
        studentEntity15.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16.equals(10L));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        boolean boolean5 = courseEntity3.validation();
        courseEntity3.setId((long) (short) 0);
        relationship.RequirementSubjectRelationship requirementSubjectRelationship8 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship8.setSubject((java.lang.Long) 0L);
        requirementSubjectRelationship8.setParent((java.lang.Long) 10L);
        requirementSubjectRelationship8.setSubject((java.lang.Long) 100L);
        requirementSubjectRelationship8.setId(10L);
        boolean boolean17 = courseEntity3.equals((java.lang.Object) requirementSubjectRelationship8);
        java.lang.String str18 = courseEntity3.getName();
        long long19 = courseEntity3.getId();
        java.lang.Long long20 = courseEntity3.getDepartment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20.equals(1L));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        basic.SecretaryEntity secretaryEntity0 = new basic.SecretaryEntity();
        basic.SubjectEntity subjectEntity10 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity10.setDescription("");
        boolean boolean13 = subjectEntity10.validation();
        subjectEntity10.setDescription("");
        boolean boolean16 = secretaryEntity0.equals((java.lang.Object) "");
        secretaryEntity0.setName("");
        java.lang.Long long19 = secretaryEntity0.getDepartment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long19);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        relationship.RequirementCreditRelationship requirementCreditRelationship2 = new relationship.RequirementCreditRelationship((java.lang.Long) 1L, (java.lang.Long) 10L);
        requirementCreditRelationship2.setCredit((java.lang.Long) 1L);
        long long5 = requirementCreditRelationship2.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) 32L, "hi!", (java.lang.Long) 100L);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        basic.DepartmentEntity departmentEntity2 = new basic.DepartmentEntity("", (java.lang.Long) 100L);
        boolean boolean3 = departmentEntity2.validation();
        boolean boolean4 = departmentEntity2.validation();
        departmentEntity2.setName("");
        boolean boolean7 = departmentEntity2.validation();
        departmentEntity2.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        basic.SubjectEntity subjectEntity0 = new basic.SubjectEntity();
        java.lang.Boolean boolean1 = subjectEntity0.getBinding();
        java.lang.String str2 = subjectEntity0.getName();
        subjectEntity0.setLevel((java.lang.Long) 0L);
        java.lang.String str5 = subjectEntity0.getCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) 10L, "hi!", (java.lang.Long) (-1L));
        relationship.filter.MatriculateFilter matriculateFilter4 = new relationship.filter.MatriculateFilter();
        boolean boolean5 = secretaryEntity3.equals((java.lang.Object) matriculateFilter4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<relationship.MatriculateRelationship> matriculateRelationshipList7 = matriculateFilter4.studentMatriculateFrom((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        basic.DepartmentEntity departmentEntity0 = new basic.DepartmentEntity();
        boolean boolean2 = departmentEntity0.equals((java.lang.Object) 1L);
        departmentEntity0.setName("");
        departmentEntity0.setId(10L);
        basic.StudentEntity studentEntity12 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.String str13 = studentEntity12.getRegistration();
        studentEntity12.setRegistration("");
        boolean boolean16 = departmentEntity0.equals((java.lang.Object) studentEntity12);
        java.lang.Long long17 = studentEntity12.getLevel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17.equals(1L));
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "", (java.lang.Long) 10L, (java.lang.Long) (-1L), (java.lang.Integer) (-1), (java.lang.Boolean) false, (java.lang.Long) (-1L), (java.lang.Long) 0L, "hi!");
        subjectEntity9.setCourse((java.lang.Long) 0L);
        subjectEntity9.setName("");
        subjectEntity9.setId((long) (byte) -1);
        subjectEntity9.setWorkload((java.lang.Integer) 10);
        java.lang.Long long18 = subjectEntity9.getCourse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18.equals(0L));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity3.setName("");
        secretaryEntity3.setName("");
        secretaryEntity3.setName("");
        secretaryEntity3.setName("");
        java.lang.Long long12 = secretaryEntity3.getLevel();
        secretaryEntity3.setName("");
        java.lang.String str15 = secretaryEntity3.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        relationship.MatriculateRelationship matriculateRelationship0 = new relationship.MatriculateRelationship();
        java.lang.Long long1 = matriculateRelationship0.getSubject();
        matriculateRelationship0.setSubject((java.lang.Long) 10L);
        matriculateRelationship0.setStudent((java.lang.Long) 100L);
        matriculateRelationship0.setId((long) (byte) 1);
        matriculateRelationship0.setId((long) (-1));
        java.lang.Long long10 = matriculateRelationship0.getSubject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10.equals(10L));
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList3 = offeredFilter0.fromCourseToStudent((java.lang.Long) 10L, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("hi!", "hi!", (java.lang.Long) 32L, (java.lang.Long) 10L, (java.lang.Integer) 10, (java.lang.Boolean) true, (java.lang.Long) 10L, (java.lang.Long) 0L, "");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        functional.view.SecretaryView secretaryView0 = new functional.view.SecretaryView();
        java.lang.String str1 = secretaryView0.toString();
        basic.CourseEntity courseEntity5 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long6 = courseEntity5.getId();
        boolean boolean7 = courseEntity5.validation();
        courseEntity5.setId((long) (short) 0);
        relationship.MatriculateRelationship matriculateRelationship12 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        long long13 = matriculateRelationship12.getId();
        matriculateRelationship12.setStudent((java.lang.Long) 10L);
        boolean boolean16 = courseEntity5.equals((java.lang.Object) 10L);
        courseEntity5.setName("hi!");
        functional.view.SecretaryView secretaryView19 = new functional.view.SecretaryView();
        basic.SecretaryEntity secretaryEntity23 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity23.setName("");
        secretaryView19.setSecretaryEntity(secretaryEntity23);
        basic.SecretaryEntity secretaryEntity27 = new basic.SecretaryEntity();
        secretaryEntity27.setLevel((java.lang.Long) 10L);
        secretaryView19.setSecretaryEntity(secretaryEntity27);
        long long31 = secretaryEntity27.getId();
        boolean boolean32 = courseEntity5.equals((java.lang.Object) secretaryEntity27);
        secretaryView0.setSecretaryEntity(secretaryEntity27);
        secretaryEntity27.setLevel((java.lang.Long) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        relationship.MatriculateRelationship matriculateRelationship0 = new relationship.MatriculateRelationship();
        java.lang.Long long1 = matriculateRelationship0.getSubject();
        matriculateRelationship0.setSubject((java.lang.Long) (-1L));
        java.lang.Long long4 = matriculateRelationship0.getStudent();
        matriculateRelationship0.setId((long) 0);
        basic.TeacherEntity teacherEntity7 = new basic.TeacherEntity();
        java.lang.String str8 = teacherEntity7.getName();
        java.lang.String str9 = teacherEntity7.getName();
        teacherEntity7.setId(100L);
        teacherEntity7.setDepartment((java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass14 = teacherEntity7.getClass();
        boolean boolean15 = matriculateRelationship0.equals((java.lang.Object) wildcardClass14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) 0L, "hi!", (java.lang.Long) 0L);
        secretaryEntity3.setId((long) (byte) 0);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList3 = offeredFilter0.fromDepartmentToStudent((java.lang.Long) 1L, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList3 = offeredFilter0.fromDepartmentToStudent((java.lang.Long) 100L, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView6 = new functional.view.StudentView(studentEntity5);
        basic.StudentEntity studentEntity7 = studentView6.getStudentEntity();
        basic.StudentEntity studentEntity8 = studentView6.getStudentEntity();
        basic.StudentEntity studentEntity9 = studentView6.getStudentEntity();
        basic.StudentEntity studentEntity15 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long16 = studentEntity15.getCourse();
        functional.view.StudentView studentView17 = new functional.view.StudentView(studentEntity15);
        studentView6.setStudentEntity(studentEntity15);
        basic.StudentEntity studentEntity19 = studentView6.getStudentEntity();
        basic.StudentEntity studentEntity25 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long26 = studentEntity25.getCourse();
        java.lang.Long long27 = studentEntity25.getLevel();
        long long28 = studentEntity25.getId();
        studentEntity25.setCourse((java.lang.Long) (-1L));
        studentView6.setStudentEntity(studentEntity25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        java.lang.Long long10 = subjectEntity9.getResponsibleTeacher();
        basic.CourseEntity courseEntity14 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long15 = courseEntity14.getId();
        boolean boolean16 = courseEntity14.validation();
        courseEntity14.setId((long) (short) 0);
        relationship.RequirementSubjectRelationship requirementSubjectRelationship19 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship19.setSubject((java.lang.Long) 0L);
        requirementSubjectRelationship19.setParent((java.lang.Long) 10L);
        requirementSubjectRelationship19.setSubject((java.lang.Long) 100L);
        requirementSubjectRelationship19.setId(10L);
        boolean boolean28 = courseEntity14.equals((java.lang.Object) requirementSubjectRelationship19);
        java.lang.String str29 = courseEntity14.getName();
        courseEntity14.setId((long) (byte) -1);
        long long32 = courseEntity14.getId();
        relationship.RequirementCreditRelationship requirementCreditRelationship35 = new relationship.RequirementCreditRelationship((java.lang.Long) 1L, (java.lang.Long) 10L);
        requirementCreditRelationship35.setId((long) (short) 100);
        long long38 = requirementCreditRelationship35.getId();
        boolean boolean39 = courseEntity14.equals((java.lang.Object) requirementCreditRelationship35);
        courseEntity14.setId((long) (short) 10);
        boolean boolean42 = subjectEntity9.equals((java.lang.Object) courseEntity14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        functional.view.SecretaryView secretaryView0 = new functional.view.SecretaryView();
        basic.SecretaryEntity secretaryEntity4 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity4.setName("");
        secretaryView0.setSecretaryEntity(secretaryEntity4);
        basic.SecretaryEntity secretaryEntity8 = new basic.SecretaryEntity();
        secretaryEntity8.setLevel((java.lang.Long) 10L);
        secretaryView0.setSecretaryEntity(secretaryEntity8);
        java.lang.Long long12 = secretaryEntity8.getLevel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12.equals(10L));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) 10L, "hi!", (java.lang.Long) (-1L));
        relationship.filter.MatriculateFilter matriculateFilter4 = new relationship.filter.MatriculateFilter();
        boolean boolean5 = secretaryEntity3.equals((java.lang.Object) matriculateFilter4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<relationship.MatriculateRelationship> matriculateRelationshipList7 = matriculateFilter4.studentMatriculateFrom((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship2 = new relationship.RequirementSubjectRelationship((java.lang.Long) 0L, (java.lang.Long) 1L);
        long long3 = requirementSubjectRelationship2.getId();
        java.lang.Long long4 = requirementSubjectRelationship2.getParent();
        requirementSubjectRelationship2.setSubject((java.lang.Long) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4.equals(0L));
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        relationship.ApprovedRelationship approvedRelationship2 = new relationship.ApprovedRelationship((java.lang.Long) (-1L), (java.lang.Long) 0L);
        java.lang.Long long3 = approvedRelationship2.getId();
        approvedRelationship2.setId((java.lang.Long) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        relationship.RequirementCreditRelationship requirementCreditRelationship2 = new relationship.RequirementCreditRelationship((java.lang.Long) 1L, (java.lang.Long) 10L);
        requirementCreditRelationship2.setId((long) (short) 100);
        requirementCreditRelationship2.setCredit((java.lang.Long) 0L);
        functional.view.SecretaryView secretaryView7 = new functional.view.SecretaryView();
        basic.SecretaryEntity secretaryEntity11 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity11.setName("");
        secretaryView7.setSecretaryEntity(secretaryEntity11);
        basic.SecretaryEntity secretaryEntity15 = new basic.SecretaryEntity();
        secretaryEntity15.setLevel((java.lang.Long) 10L);
        secretaryView7.setSecretaryEntity(secretaryEntity15);
        boolean boolean19 = requirementCreditRelationship2.equals((java.lang.Object) secretaryView7);
        requirementCreditRelationship2.setSubject((java.lang.Long) 1L);
        long long22 = requirementCreditRelationship2.getId();
        java.lang.Long long23 = requirementCreditRelationship2.getSubject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23.equals(1L));
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        relationship.MatriculateRelationship matriculateRelationship0 = new relationship.MatriculateRelationship();
        java.lang.Long long1 = matriculateRelationship0.getSubject();
        long long2 = matriculateRelationship0.getId();
        matriculateRelationship0.setId((long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship2 = new relationship.RequirementSubjectRelationship((java.lang.Long) 0L, (java.lang.Long) 0L);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        relationship.OfferedRelationship offeredRelationship2 = new relationship.OfferedRelationship((java.lang.Long) 100L, (java.lang.Long) 10L);
        offeredRelationship2.setId(1L);
        offeredRelationship2.setCourse((java.lang.Long) 1L);
        basic.StudentEntity studentEntity12 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long13 = studentEntity12.getCourse();
        functional.view.StudentView studentView14 = new functional.view.StudentView(studentEntity12);
        boolean boolean15 = offeredRelationship2.equals((java.lang.Object) studentView14);
        offeredRelationship2.setCourse((java.lang.Long) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        relationship.ApprovedRelationship approvedRelationship2 = new relationship.ApprovedRelationship((java.lang.Long) (-1L), (java.lang.Long) 0L);
        java.lang.Long long3 = approvedRelationship2.getStudent();
        approvedRelationship2.setSubject((java.lang.Long) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3.equals((-1L)));
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        relationship.OfferedRelationship offeredRelationship2 = new relationship.OfferedRelationship((java.lang.Long) 100L, (java.lang.Long) 10L);
        offeredRelationship2.setId(1L);
        offeredRelationship2.setSubject((java.lang.Long) 0L);
        java.lang.Long long7 = offeredRelationship2.getCourse();
        java.lang.Long long8 = offeredRelationship2.getSubject();
        relationship.RequirementCreditRelationship requirementCreditRelationship11 = new relationship.RequirementCreditRelationship((java.lang.Long) 1L, (java.lang.Long) 10L);
        java.lang.Long long12 = requirementCreditRelationship11.getCredit();
        boolean boolean13 = offeredRelationship2.equals((java.lang.Object) long12);
        offeredRelationship2.setSubject((java.lang.Long) 0L);
        java.lang.Long long16 = offeredRelationship2.getCourse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16.equals(100L));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        basic.SubjectEntity subjectEntity0 = new basic.SubjectEntity();
        java.lang.Long long1 = subjectEntity0.getResponsibleTeacher();
        java.lang.Long long2 = subjectEntity0.getCourse();
        boolean boolean3 = subjectEntity0.isNull();
        java.lang.Integer int4 = subjectEntity0.getWorkload();
        java.lang.Long long5 = subjectEntity0.getResponsibleTeacher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        basic.TeacherEntity teacherEntity0 = new basic.TeacherEntity();
        teacherEntity0.setId((long) 10);
        teacherEntity0.setName("hi!");
        teacherEntity0.setDepartment((java.lang.Long) 10L);
        functional.view.SecretaryView secretaryView7 = new functional.view.SecretaryView();
        basic.SecretaryEntity secretaryEntity11 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity11.setName("");
        secretaryView7.setSecretaryEntity(secretaryEntity11);
        basic.SecretaryEntity secretaryEntity15 = new basic.SecretaryEntity();
        secretaryEntity15.setLevel((java.lang.Long) 10L);
        secretaryView7.setSecretaryEntity(secretaryEntity15);
        basic.SecretaryEntity secretaryEntity19 = secretaryView7.getSecretaryEntity();
        relationship.ApprovedRelationship approvedRelationship22 = new relationship.ApprovedRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        approvedRelationship22.setId((java.lang.Long) 10L);
        boolean boolean25 = secretaryEntity19.equals((java.lang.Object) approvedRelationship22);
        boolean boolean26 = teacherEntity0.equals((java.lang.Object) secretaryEntity19);
        java.lang.Long long27 = secretaryEntity19.getDepartment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(secretaryEntity19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long27);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        relationship.ApprovedRelationship approvedRelationship2 = new relationship.ApprovedRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        approvedRelationship2.setId((java.lang.Long) 10L);
        approvedRelationship2.setStudent((java.lang.Long) 10L);
        java.lang.Long long7 = approvedRelationship2.getSubject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7.equals(10L));
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        basic.DepartmentEntity departmentEntity2 = new basic.DepartmentEntity("", (java.lang.Long) (-1L));
        basic.DepartmentEntity departmentEntity3 = new basic.DepartmentEntity();
        boolean boolean5 = departmentEntity3.equals((java.lang.Object) 1L);
        departmentEntity3.setName("");
        departmentEntity3.setName("hi!");
        departmentEntity3.setId((long) (byte) 0);
        departmentEntity3.setId((long) (short) -1);
        long long14 = departmentEntity3.getId();
        long long15 = departmentEntity3.getId();
        boolean boolean16 = departmentEntity2.equals((java.lang.Object) long15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("hi!", (java.lang.Long) (-1L), (java.lang.Long) 0L);
        courseEntity3.setDepartment((java.lang.Long) 0L);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        relationship.ApprovedRelationship approvedRelationship2 = new relationship.ApprovedRelationship((java.lang.Long) (-1L), (java.lang.Long) 0L);
        java.lang.Long long3 = approvedRelationship2.getStudent();
        java.lang.Long long4 = approvedRelationship2.getId();
        approvedRelationship2.setId((java.lang.Long) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        relationship.MatriculateRelationship matriculateRelationship2 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        java.lang.Object obj3 = null;
        boolean boolean4 = matriculateRelationship2.equals(obj3);
        java.lang.Class<?> wildcardClass5 = matriculateRelationship2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        java.lang.String str10 = subjectEntity9.getDescription();
        boolean boolean11 = subjectEntity9.isNull();
        subjectEntity9.setCode("");
        subjectEntity9.setWorkload((java.lang.Integer) 0);
        java.lang.Long long16 = subjectEntity9.getCredit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16.equals((-1L)));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView6 = new functional.view.StudentView(studentEntity5);
        studentEntity5.setId((long) 1);
        functional.view.StudentView studentView9 = new functional.view.StudentView(studentEntity5);
        functional.view.StudentView studentView10 = new functional.view.StudentView(studentEntity5);
        basic.StudentEntity studentEntity11 = studentView10.getStudentEntity();
        java.lang.String str12 = studentEntity11.getName();
        java.lang.String str13 = studentEntity11.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        boolean boolean5 = courseEntity3.validation();
        courseEntity3.setId((long) (short) 0);
        relationship.RequirementSubjectRelationship requirementSubjectRelationship8 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship8.setSubject((java.lang.Long) 0L);
        requirementSubjectRelationship8.setParent((java.lang.Long) 10L);
        requirementSubjectRelationship8.setSubject((java.lang.Long) 100L);
        requirementSubjectRelationship8.setId(10L);
        boolean boolean17 = courseEntity3.equals((java.lang.Object) requirementSubjectRelationship8);
        java.lang.String str18 = courseEntity3.getName();
        courseEntity3.setId((long) (byte) -1);
        long long21 = courseEntity3.getId();
        java.lang.String str22 = courseEntity3.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView6 = new functional.view.StudentView(studentEntity5);
        studentEntity5.setCourse((java.lang.Long) 0L);
        java.lang.Long long9 = studentEntity5.getCourse();
        java.lang.String str10 = studentEntity5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        basic.CourseEntity courseEntity0 = new basic.CourseEntity();
        boolean boolean2 = courseEntity0.equals((java.lang.Object) 100.0f);
        courseEntity0.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        basic.TeacherEntity teacherEntity0 = new basic.TeacherEntity();
        java.lang.String str1 = teacherEntity0.getName();
        java.lang.String str2 = teacherEntity0.getName();
        teacherEntity0.setDepartment((java.lang.Long) 0L);
        boolean boolean5 = teacherEntity0.validation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity3.setName("");
        secretaryEntity3.setName("");
        secretaryEntity3.setName("");
        java.lang.String str10 = secretaryEntity3.getName();
        secretaryEntity3.setId((long) (byte) 1);
        boolean boolean13 = secretaryEntity3.validation();
        java.lang.Long long14 = secretaryEntity3.getDepartment();
        java.lang.Long long15 = secretaryEntity3.getDepartment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15.equals(0L));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        functional.Matriculation matriculation0 = new functional.Matriculation();
        java.lang.Boolean boolean1 = matriculation0.doMatriculation();
        java.lang.Boolean boolean2 = matriculation0.doMatriculation();
        dao.StudentDao studentDao3 = null;
        matriculation0.setStudentDao(studentDao3);
        java.util.List<basic.SubjectEntity> subjectEntityList5 = matriculation0.getSubjects();
        functional.Matriculation matriculation6 = new functional.Matriculation();
        dao.StudentDao studentDao7 = matriculation6.getStudentDao();
        basic.StudentEntity studentEntity13 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView14 = new functional.view.StudentView(studentEntity13);
        java.lang.Long long15 = studentEntity13.getLevel();
        java.lang.Long long16 = studentEntity13.getLevel();
        basic.StudentEntity studentEntity22 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView23 = new functional.view.StudentView(studentEntity22);
        basic.StudentEntity studentEntity24 = studentView23.getStudentEntity();
        basic.StudentEntity studentEntity25 = studentView23.getStudentEntity();
        java.lang.Long long26 = studentEntity25.getLevel();
        basic.SubjectEntity subjectEntity36 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity36.setDescription("");
        subjectEntity36.setWorkload((java.lang.Integer) 100);
        basic.StudentEntity studentEntity46 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView47 = new functional.view.StudentView(studentEntity46);
        basic.StudentEntity studentEntity48 = studentView47.getStudentEntity();
        basic.StudentEntity studentEntity49 = studentView47.getStudentEntity();
        basic.StudentEntity studentEntity50 = studentView47.getStudentEntity();
        boolean boolean51 = subjectEntity36.equals((java.lang.Object) studentEntity50);
        java.lang.String str52 = studentEntity50.getRegistration();
        basic.StudentEntity studentEntity53 = new basic.StudentEntity();
        studentEntity53.setId((long) (byte) 0);
        basic.StudentEntity studentEntity61 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.String str62 = studentEntity61.getRegistration();
        studentEntity61.setCourse((java.lang.Long) (-1L));
        java.lang.Long long65 = studentEntity61.getCourse();
        functional.view.StudentView studentView66 = new functional.view.StudentView(studentEntity61);
        basic.StudentEntity studentEntity72 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long73 = studentEntity72.getCourse();
        java.lang.Long long74 = studentEntity72.getLevel();
        studentView66.setStudentEntity(studentEntity72);
        basic.StudentEntity studentEntity81 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView82 = new functional.view.StudentView(studentEntity81);
        basic.StudentEntity studentEntity83 = studentView82.getStudentEntity();
        java.lang.String str84 = studentEntity83.getRegistration();
        basic.StudentEntity[] studentEntityArray85 = new basic.StudentEntity[]{studentEntity13, studentEntity25, studentEntity50, studentEntity53, studentEntity72, studentEntity83};
        java.util.ArrayList<basic.StudentEntity> studentEntityList86 = new java.util.ArrayList<basic.StudentEntity>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<basic.StudentEntity>) studentEntityList86, studentEntityArray85);
        matriculation6.setStudentAvailable((java.util.List<basic.StudentEntity>) studentEntityList86);
        matriculation0.setStudentAvailable((java.util.List<basic.StudentEntity>) studentEntityList86);
        java.lang.Boolean boolean90 = matriculation0.doMatriculation();
        basic.StudentEntity studentEntity91 = matriculation0.getSelectedStudent();
        java.util.List<basic.SubjectEntity> subjectEntityList92 = matriculation0.getOffer();
        java.util.List<basic.SubjectEntity> subjectEntityList93 = matriculation0.getSubjects();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntityList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "" + "'", str62.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + (-1L) + "'", long65.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 10L + "'", long73.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 1L + "'", long74.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "" + "'", str84.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntityArray85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntityList92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntityList93);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        java.lang.Long long10 = subjectEntity9.getCourse();
        boolean boolean11 = subjectEntity9.validation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        basic.TeacherEntity teacherEntity0 = new basic.TeacherEntity();
        teacherEntity0.setId((long) 10);
        teacherEntity0.setName("");
        java.lang.Long long5 = teacherEntity0.getDepartment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        relationship.ApprovedRelationship approvedRelationship2 = new relationship.ApprovedRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        approvedRelationship2.setId((java.lang.Long) 10L);
        java.lang.Long long5 = approvedRelationship2.getSubject();
        approvedRelationship2.setId((java.lang.Long) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5.equals(10L));
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity9.setDescription("");
        boolean boolean12 = subjectEntity9.validation();
        subjectEntity9.setWorkload((java.lang.Integer) 100);
        java.lang.String str15 = subjectEntity9.getCode();
        java.lang.Long long16 = subjectEntity9.getLevel();
        subjectEntity9.setResponsibleTeacher((java.lang.Long) 32L);
        subjectEntity9.setDescription("hi!");
        subjectEntity9.setLevel((java.lang.Long) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16.equals(1L));
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        basic.DepartmentEntity departmentEntity2 = new basic.DepartmentEntity("", (java.lang.Long) 100L);
        boolean boolean3 = departmentEntity2.validation();
        boolean boolean4 = departmentEntity2.validation();
        departmentEntity2.setResponsible((java.lang.Long) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        relationship.filter.MatriculateFilter matriculateFilter0 = new relationship.filter.MatriculateFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<relationship.MatriculateRelationship> matriculateRelationshipList2 = matriculateFilter0.subjectMatriculateFrom((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship2 = new relationship.RequirementSubjectRelationship((java.lang.Long) 0L, (java.lang.Long) 1L);
        java.lang.Long long3 = requirementSubjectRelationship2.getSubject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3.equals(1L));
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        basic.CourseEntity courseEntity0 = new basic.CourseEntity();
        java.lang.Long long1 = courseEntity0.getDepartment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        relationship.MatriculateRelationship matriculateRelationship2 = new relationship.MatriculateRelationship((java.lang.Long) 10L, (java.lang.Long) 10L);
        long long3 = matriculateRelationship2.getId();
        long long4 = matriculateRelationship2.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        functional.view.SecretaryView secretaryView0 = new functional.view.SecretaryView();
        basic.SecretaryEntity secretaryEntity1 = null;
        secretaryView0.setSecretaryEntity(secretaryEntity1);
        java.lang.String str3 = secretaryView0.toString();
        basic.SecretaryEntity secretaryEntity4 = secretaryView0.getSecretaryEntity();
        java.lang.String str5 = secretaryView0.toString();
        basic.SecretaryEntity secretaryEntity6 = secretaryView0.getSecretaryEntity();
        java.lang.String str7 = secretaryView0.toString();
        functional.view.SecretaryView secretaryView8 = new functional.view.SecretaryView();
        java.lang.String str9 = secretaryView8.toString();
        basic.CourseEntity courseEntity13 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long14 = courseEntity13.getId();
        boolean boolean15 = courseEntity13.validation();
        courseEntity13.setId((long) (short) 0);
        relationship.MatriculateRelationship matriculateRelationship20 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        long long21 = matriculateRelationship20.getId();
        matriculateRelationship20.setStudent((java.lang.Long) 10L);
        boolean boolean24 = courseEntity13.equals((java.lang.Object) 10L);
        courseEntity13.setName("hi!");
        functional.view.SecretaryView secretaryView27 = new functional.view.SecretaryView();
        basic.SecretaryEntity secretaryEntity31 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity31.setName("");
        secretaryView27.setSecretaryEntity(secretaryEntity31);
        basic.SecretaryEntity secretaryEntity35 = new basic.SecretaryEntity();
        secretaryEntity35.setLevel((java.lang.Long) 10L);
        secretaryView27.setSecretaryEntity(secretaryEntity35);
        long long39 = secretaryEntity35.getId();
        boolean boolean40 = courseEntity13.equals((java.lang.Object) secretaryEntity35);
        secretaryView8.setSecretaryEntity(secretaryEntity35);
        secretaryView0.setSecretaryEntity(secretaryEntity35);
        basic.SecretaryEntity secretaryEntity43 = secretaryView0.getSecretaryEntity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(secretaryEntity4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(secretaryEntity6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(secretaryEntity43);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        relationship.ApprovedRelationship approvedRelationship2 = new relationship.ApprovedRelationship((java.lang.Long) 100L, (java.lang.Long) 1L);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        functional.Matriculation matriculation0 = new functional.Matriculation();
        basic.StudentEntity studentEntity1 = matriculation0.getSelectedStudent();
        java.util.List<basic.StudentEntity> studentEntityList2 = null;
        matriculation0.setStudentAvailable(studentEntityList2);
        dao.StudentDao studentDao4 = null;
        matriculation0.setStudentDao(studentDao4);
        java.util.List<basic.SubjectEntity> subjectEntityList6 = matriculation0.getSubjects();
        dao.StudentDao studentDao7 = matriculation0.getStudentDao();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntityList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentDao7);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        relationship.RequirementCreditRelationship requirementCreditRelationship2 = new relationship.RequirementCreditRelationship((java.lang.Long) 1L, (java.lang.Long) 10L);
        requirementCreditRelationship2.setId((long) (short) 100);
        java.lang.Long long5 = requirementCreditRelationship2.getCredit();
        long long6 = requirementCreditRelationship2.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        relationship.OfferedRelationship offeredRelationship2 = new relationship.OfferedRelationship((java.lang.Long) 100L, (java.lang.Long) 10L);
        offeredRelationship2.setId(1L);
        offeredRelationship2.setId((long) (short) 0);
        java.lang.Object obj7 = null;
        boolean boolean8 = offeredRelationship2.equals(obj7);
        offeredRelationship2.setSubject((java.lang.Long) 100L);
        offeredRelationship2.setSubject((java.lang.Long) 10L);
        offeredRelationship2.setCourse((java.lang.Long) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        basic.SubjectEntity subjectEntity0 = new basic.SubjectEntity();
        java.lang.String str1 = subjectEntity0.getDescription();
        java.lang.Long long2 = subjectEntity0.getCredit();
        subjectEntity0.setCourse((java.lang.Long) 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        java.lang.Long long10 = subjectEntity9.getCourse();
        java.lang.Long long11 = subjectEntity9.getCredit();
        long long12 = subjectEntity9.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.lang.Long long4 = courseEntity3.getDepartment();
        courseEntity3.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4.equals(1L));
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) 1L, "", (java.lang.Long) 100L);
        java.lang.String str4 = secretaryEntity3.getName();
        basic.StudentEntity studentEntity5 = new basic.StudentEntity();
        java.lang.Long long6 = studentEntity5.getCourse();
        long long7 = studentEntity5.getId();
        boolean boolean8 = secretaryEntity3.equals((java.lang.Object) long7);
        secretaryEntity3.setLevel((java.lang.Long) 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        functional.view.SecretaryView secretaryView0 = new functional.view.SecretaryView();
        basic.SecretaryEntity secretaryEntity4 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity4.setName("");
        secretaryView0.setSecretaryEntity(secretaryEntity4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = secretaryView0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        relationship.filter.RequirementCreditFilter requirementCreditFilter0 = new relationship.filter.RequirementCreditFilter();
        // The following exception was thrown during execution in test generation
        try {
            relationship.RequirementCreditRelationship requirementCreditRelationship2 = requirementCreditFilter0.fromSubject((java.lang.Long) 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        relationship.MatriculateRelationship matriculateRelationship2 = new relationship.MatriculateRelationship((java.lang.Long) 32L, (java.lang.Long) (-1L));
        matriculateRelationship2.setId((long) (short) 1);
        basic.SubjectEntity subjectEntity14 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 0L, (java.lang.Long) 100L, (java.lang.Integer) (-1), (java.lang.Boolean) false, (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.String str15 = subjectEntity14.getName();
        boolean boolean16 = matriculateRelationship2.equals((java.lang.Object) subjectEntity14);
        subjectEntity14.setName("hi!");
        java.lang.Boolean boolean19 = subjectEntity14.getBinding();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19.equals(false));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        basic.DepartmentEntity departmentEntity0 = new basic.DepartmentEntity();
        boolean boolean2 = departmentEntity0.equals((java.lang.Object) 1L);
        departmentEntity0.setName("");
        departmentEntity0.setId(10L);
        basic.StudentEntity studentEntity12 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.String str13 = studentEntity12.getRegistration();
        studentEntity12.setRegistration("");
        boolean boolean16 = departmentEntity0.equals((java.lang.Object) studentEntity12);
        java.lang.String str17 = departmentEntity0.getName();
        departmentEntity0.setId((long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        courseEntity3.setLevel((java.lang.Long) 100L);
        courseEntity3.setLevel((java.lang.Long) 1L);
        boolean boolean10 = courseEntity3.equals((java.lang.Object) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity9.setDescription("");
        boolean boolean12 = subjectEntity9.validation();
        subjectEntity9.setWorkload((java.lang.Integer) 100);
        java.lang.String str15 = subjectEntity9.getCode();
        java.lang.String str16 = subjectEntity9.getDescription();
        long long17 = subjectEntity9.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long6 = studentEntity5.getCourse();
        functional.view.StudentView studentView7 = new functional.view.StudentView(studentEntity5);
        functional.view.SubjectView subjectView8 = new functional.view.SubjectView();
        basic.SubjectEntity subjectEntity9 = subjectView8.getSubjectEntity();
        basic.SubjectEntity subjectEntity10 = new basic.SubjectEntity();
        subjectView8.setSubjectEntity(subjectEntity10);
        boolean boolean12 = studentEntity5.equals((java.lang.Object) subjectView8);
        java.lang.String str13 = subjectView8.toString();
        basic.SubjectEntity subjectEntity14 = subjectView8.getSubjectEntity();
        java.lang.String str15 = subjectView8.toString();
        basic.SubjectEntity subjectEntity16 = subjectView8.getSubjectEntity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntity9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(subjectEntity14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(subjectEntity16);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity9.setDescription("");
        boolean boolean12 = subjectEntity9.validation();
        subjectEntity9.setWorkload((java.lang.Integer) 100);
        subjectEntity9.setResponsibleTeacher((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass17 = subjectEntity9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) 10L, "hi!", (java.lang.Long) (-1L));
        relationship.filter.MatriculateFilter matriculateFilter4 = new relationship.filter.MatriculateFilter();
        boolean boolean5 = secretaryEntity3.equals((java.lang.Object) matriculateFilter4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<relationship.MatriculateRelationship> matriculateRelationshipList7 = matriculateFilter4.subjectMatriculateFrom((java.lang.Long) 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        basic.TeacherEntity teacherEntity0 = new basic.TeacherEntity();
        teacherEntity0.setId((long) 10);
        basic.SubjectEntity subjectEntity12 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 0L, (java.lang.Long) 100L, (java.lang.Integer) (-1), (java.lang.Boolean) false, (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        boolean boolean13 = subjectEntity12.isNull();
        basic.StudentEntity studentEntity19 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        boolean boolean20 = subjectEntity12.equals((java.lang.Object) "");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship21 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship21.setSubject((java.lang.Long) 0L);
        boolean boolean24 = subjectEntity12.equals((java.lang.Object) 0L);
        boolean boolean25 = teacherEntity0.equals((java.lang.Object) boolean24);
        java.lang.String str26 = teacherEntity0.getName();
        teacherEntity0.setId((long) (short) -1);
        basic.DepartmentEntity departmentEntity29 = new basic.DepartmentEntity();
        boolean boolean31 = departmentEntity29.equals((java.lang.Object) 1L);
        departmentEntity29.setName("");
        departmentEntity29.setId(10L);
        basic.StudentEntity studentEntity41 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.String str42 = studentEntity41.getRegistration();
        studentEntity41.setRegistration("");
        boolean boolean45 = departmentEntity29.equals((java.lang.Object) studentEntity41);
        boolean boolean46 = teacherEntity0.equals((java.lang.Object) departmentEntity29);
        departmentEntity29.setResponsible((java.lang.Long) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long6 = studentEntity5.getCourse();
        functional.view.StudentView studentView7 = new functional.view.StudentView(studentEntity5);
        functional.view.SubjectView subjectView8 = new functional.view.SubjectView();
        basic.SubjectEntity subjectEntity9 = subjectView8.getSubjectEntity();
        basic.SubjectEntity subjectEntity10 = new basic.SubjectEntity();
        subjectView8.setSubjectEntity(subjectEntity10);
        boolean boolean12 = studentEntity5.equals((java.lang.Object) subjectView8);
        java.lang.String str13 = subjectView8.toString();
        basic.SubjectEntity subjectEntity14 = subjectView8.getSubjectEntity();
        subjectEntity14.setCourse((java.lang.Long) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntity9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(subjectEntity14);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship0 = new relationship.RequirementSubjectRelationship();
        basic.StudentEntity studentEntity6 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long7 = studentEntity6.getCourse();
        functional.view.StudentView studentView8 = new functional.view.StudentView(studentEntity6);
        boolean boolean9 = requirementSubjectRelationship0.equals((java.lang.Object) studentView8);
        requirementSubjectRelationship0.setParent((java.lang.Long) 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView6 = new functional.view.StudentView(studentEntity5);
        basic.StudentEntity studentEntity7 = studentView6.getStudentEntity();
        basic.StudentEntity studentEntity8 = studentView6.getStudentEntity();
        basic.StudentEntity studentEntity9 = studentView6.getStudentEntity();
        studentEntity9.setName("hi!");
        studentEntity9.setId((long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity9);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) 10L, "hi!", (java.lang.Long) (-1L));
        relationship.filter.MatriculateFilter matriculateFilter4 = new relationship.filter.MatriculateFilter();
        boolean boolean5 = secretaryEntity3.equals((java.lang.Object) matriculateFilter4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<relationship.MatriculateRelationship> matriculateRelationshipList7 = matriculateFilter4.studentMatriculateFrom((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship0 = new relationship.RequirementSubjectRelationship();
        basic.StudentEntity studentEntity6 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long7 = studentEntity6.getCourse();
        functional.view.StudentView studentView8 = new functional.view.StudentView(studentEntity6);
        boolean boolean9 = requirementSubjectRelationship0.equals((java.lang.Object) studentView8);
        basic.StudentEntity studentEntity15 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView16 = new functional.view.StudentView(studentEntity15);
        basic.StudentEntity studentEntity17 = studentView16.getStudentEntity();
        java.lang.Long long18 = studentEntity17.getCourse();
        java.lang.String str19 = studentEntity17.getRegistration();
        boolean boolean20 = studentEntity17.validation();
        studentView8.setStudentEntity(studentEntity17);
        studentEntity17.setRegistration("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship0 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship0.setSubject((java.lang.Long) 0L);
        requirementSubjectRelationship0.setParent((java.lang.Long) 10L);
        requirementSubjectRelationship0.setSubject((java.lang.Long) 100L);
        java.lang.Long long7 = requirementSubjectRelationship0.getSubject();
        relationship.OfferedRelationship offeredRelationship10 = new relationship.OfferedRelationship((java.lang.Long) 100L, (java.lang.Long) 10L);
        offeredRelationship10.setId(1L);
        offeredRelationship10.setCourse((java.lang.Long) 1L);
        basic.StudentEntity studentEntity20 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long21 = studentEntity20.getCourse();
        functional.view.StudentView studentView22 = new functional.view.StudentView(studentEntity20);
        boolean boolean23 = offeredRelationship10.equals((java.lang.Object) studentView22);
        offeredRelationship10.setSubject((java.lang.Long) 1L);
        offeredRelationship10.setSubject((java.lang.Long) 0L);
        boolean boolean28 = requirementSubjectRelationship0.equals((java.lang.Object) offeredRelationship10);
        relationship.RequirementSubjectRelationship requirementSubjectRelationship29 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship29.setSubject((java.lang.Long) 0L);
        boolean boolean33 = requirementSubjectRelationship29.equals((java.lang.Object) (short) -1);
        java.lang.Long long34 = requirementSubjectRelationship29.getSubject();
        requirementSubjectRelationship29.setSubject((java.lang.Long) 0L);
        long long37 = requirementSubjectRelationship29.getId();
        java.lang.Class<?> wildcardClass38 = requirementSubjectRelationship29.getClass();
        boolean boolean39 = offeredRelationship10.equals((java.lang.Object) requirementSubjectRelationship29);
        java.lang.Long long40 = offeredRelationship10.getCourse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40.equals(1L));
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        boolean boolean5 = courseEntity3.validation();
        courseEntity3.setId((long) (short) 0);
        relationship.RequirementSubjectRelationship requirementSubjectRelationship8 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship8.setSubject((java.lang.Long) 0L);
        requirementSubjectRelationship8.setParent((java.lang.Long) 10L);
        requirementSubjectRelationship8.setSubject((java.lang.Long) 100L);
        requirementSubjectRelationship8.setId(10L);
        boolean boolean17 = courseEntity3.equals((java.lang.Object) requirementSubjectRelationship8);
        courseEntity3.setDepartment((java.lang.Long) 100L);
        courseEntity3.setDepartment((java.lang.Long) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        basic.TeacherEntity teacherEntity0 = new basic.TeacherEntity();
        java.lang.String str1 = teacherEntity0.getName();
        long long2 = teacherEntity0.getId();
        java.lang.Long long3 = teacherEntity0.getDepartment();
        java.lang.Long long4 = teacherEntity0.getDepartment();
        teacherEntity0.setDepartment((java.lang.Long) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.String str6 = studentEntity5.getRegistration();
        studentEntity5.setCourse((java.lang.Long) (-1L));
        java.lang.Long long9 = studentEntity5.getCourse();
        functional.view.StudentView studentView10 = new functional.view.StudentView(studentEntity5);
        basic.StudentEntity studentEntity16 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long17 = studentEntity16.getCourse();
        java.lang.Long long18 = studentEntity16.getLevel();
        studentView10.setStudentEntity(studentEntity16);
        java.lang.Object obj20 = null;
        boolean boolean21 = studentEntity16.equals(obj20);
        boolean boolean22 = studentEntity16.validation();
        studentEntity16.setId((long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        relationship.OfferedRelationship offeredRelationship2 = new relationship.OfferedRelationship((java.lang.Long) 0L, (java.lang.Long) 1L);
        long long3 = offeredRelationship2.getId();
        offeredRelationship2.setId(10L);
        offeredRelationship2.setId(32L);
        offeredRelationship2.setId((long) 10);
        java.lang.Long long10 = offeredRelationship2.getCourse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10.equals(0L));
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        boolean boolean5 = courseEntity3.validation();
        courseEntity3.setId((long) (short) 0);
        relationship.RequirementSubjectRelationship requirementSubjectRelationship8 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship8.setSubject((java.lang.Long) 0L);
        requirementSubjectRelationship8.setParent((java.lang.Long) 10L);
        requirementSubjectRelationship8.setSubject((java.lang.Long) 100L);
        requirementSubjectRelationship8.setId(10L);
        boolean boolean17 = courseEntity3.equals((java.lang.Object) requirementSubjectRelationship8);
        java.lang.String str18 = courseEntity3.getName();
        courseEntity3.setId((long) (byte) -1);
        long long21 = courseEntity3.getId();
        boolean boolean22 = courseEntity3.validation();
        java.lang.Long long23 = courseEntity3.getLevel();
        long long24 = courseEntity3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList3 = offeredFilter0.fromDepartmentToStudent((java.lang.Long) 0L, (java.lang.Long) 32L);
            org.junit.Assert.fail("Expected exception of type org.hibernate.service.spi.ServiceException; message: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]");
        } catch (org.hibernate.service.spi.ServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList3 = offeredFilter0.fromCourseToStudent((java.lang.Long) 1L, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type org.hibernate.service.spi.ServiceException; message: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]");
        } catch (org.hibernate.service.spi.ServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        functional.view.SecretaryView secretaryView0 = new functional.view.SecretaryView();
        basic.SecretaryEntity secretaryEntity1 = null;
        secretaryView0.setSecretaryEntity(secretaryEntity1);
        java.lang.String str3 = secretaryView0.toString();
        basic.SecretaryEntity secretaryEntity4 = secretaryView0.getSecretaryEntity();
        java.lang.String str5 = secretaryView0.toString();
        basic.SecretaryEntity secretaryEntity6 = secretaryView0.getSecretaryEntity();
        basic.SecretaryEntity secretaryEntity10 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity10.setName("");
        secretaryEntity10.setName("");
        secretaryEntity10.setName("");
        java.lang.String str17 = secretaryEntity10.getName();
        secretaryEntity10.setId((long) (byte) 1);
        secretaryEntity10.setName("hi!");
        java.lang.Long long22 = secretaryEntity10.getDepartment();
        secretaryEntity10.setLevel((java.lang.Long) 0L);
        secretaryView0.setSecretaryEntity(secretaryEntity10);
        basic.SecretaryEntity secretaryEntity26 = new basic.SecretaryEntity();
        basic.SubjectEntity subjectEntity36 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity36.setDescription("");
        boolean boolean39 = subjectEntity36.validation();
        subjectEntity36.setDescription("");
        boolean boolean42 = secretaryEntity26.equals((java.lang.Object) "");
        secretaryEntity26.setName("");
        long long45 = secretaryEntity26.getId();
        secretaryView0.setSecretaryEntity(secretaryEntity26);
        basic.SecretaryEntity secretaryEntity50 = new basic.SecretaryEntity((java.lang.Long) 1L, "", (java.lang.Long) 100L);
        secretaryView0.setSecretaryEntity(secretaryEntity50);
        secretaryEntity50.setLevel((java.lang.Long) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(secretaryEntity4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(secretaryEntity6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship0 = new relationship.RequirementSubjectRelationship();
        java.lang.Long long1 = requirementSubjectRelationship0.getSubject();
        functional.Matriculation matriculation2 = new functional.Matriculation();
        java.util.List<basic.StudentEntity> studentEntityList3 = matriculation2.getStudentAvailable();
        boolean boolean4 = requirementSubjectRelationship0.equals((java.lang.Object) studentEntityList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntityList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        boolean boolean5 = courseEntity3.validation();
        courseEntity3.setId((long) (short) 0);
        relationship.MatriculateRelationship matriculateRelationship10 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        long long11 = matriculateRelationship10.getId();
        matriculateRelationship10.setStudent((java.lang.Long) 10L);
        boolean boolean14 = courseEntity3.equals((java.lang.Object) 10L);
        courseEntity3.setDepartment((java.lang.Long) 0L);
        functional.Matriculation matriculation17 = new functional.Matriculation();
        dao.StudentDao studentDao18 = matriculation17.getStudentDao();
        boolean boolean19 = courseEntity3.equals((java.lang.Object) matriculation17);
        basic.CourseEntity courseEntity23 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long24 = courseEntity23.getId();
        boolean boolean25 = courseEntity23.validation();
        courseEntity23.setId((long) (short) 0);
        relationship.MatriculateRelationship matriculateRelationship30 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        long long31 = matriculateRelationship30.getId();
        matriculateRelationship30.setStudent((java.lang.Long) 10L);
        boolean boolean34 = courseEntity23.equals((java.lang.Object) 10L);
        courseEntity23.setDepartment((java.lang.Long) 0L);
        functional.Matriculation matriculation37 = new functional.Matriculation();
        dao.StudentDao studentDao38 = matriculation37.getStudentDao();
        boolean boolean39 = courseEntity23.equals((java.lang.Object) matriculation37);
        dao.StudentDao studentDao40 = matriculation37.getStudentDao();
        matriculation17.setStudentDao(studentDao40);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.StudentEntity> studentEntityList42 = matriculation17.start();
            org.junit.Assert.fail("Expected exception of type org.hibernate.service.spi.ServiceException; message: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]");
        } catch (org.hibernate.service.spi.ServiceException e) {
            // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao40);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity3.setName("");
        secretaryEntity3.setName("");
        secretaryEntity3.setName("");
        java.lang.String str10 = secretaryEntity3.getName();
        secretaryEntity3.setId((long) (byte) 1);
        secretaryEntity3.setName("hi!");
        secretaryEntity3.setLevel((java.lang.Long) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        relationship.OfferedRelationship offeredRelationship2 = new relationship.OfferedRelationship((java.lang.Long) 100L, (java.lang.Long) 10L);
        offeredRelationship2.setId(1L);
        offeredRelationship2.setSubject((java.lang.Long) 0L);
        java.lang.Long long7 = offeredRelationship2.getCourse();
        java.lang.Long long8 = offeredRelationship2.getSubject();
        relationship.RequirementCreditRelationship requirementCreditRelationship11 = new relationship.RequirementCreditRelationship((java.lang.Long) 1L, (java.lang.Long) 10L);
        java.lang.Long long12 = requirementCreditRelationship11.getCredit();
        boolean boolean13 = offeredRelationship2.equals((java.lang.Object) long12);
        java.lang.Long long14 = offeredRelationship2.getSubject();
        java.lang.Class<?> wildcardClass15 = offeredRelationship2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        boolean boolean5 = courseEntity3.validation();
        courseEntity3.setId((long) (short) 0);
        relationship.MatriculateRelationship matriculateRelationship10 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        long long11 = matriculateRelationship10.getId();
        matriculateRelationship10.setStudent((java.lang.Long) 10L);
        boolean boolean14 = courseEntity3.equals((java.lang.Object) 10L);
        courseEntity3.setDepartment((java.lang.Long) 0L);
        functional.Matriculation matriculation17 = new functional.Matriculation();
        dao.StudentDao studentDao18 = matriculation17.getStudentDao();
        boolean boolean19 = courseEntity3.equals((java.lang.Object) matriculation17);
        courseEntity3.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        boolean boolean5 = courseEntity3.validation();
        courseEntity3.setId((long) (short) 0);
        relationship.RequirementSubjectRelationship requirementSubjectRelationship8 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship8.setSubject((java.lang.Long) 0L);
        requirementSubjectRelationship8.setParent((java.lang.Long) 10L);
        requirementSubjectRelationship8.setSubject((java.lang.Long) 100L);
        requirementSubjectRelationship8.setId(10L);
        boolean boolean17 = courseEntity3.equals((java.lang.Object) requirementSubjectRelationship8);
        java.lang.String str18 = courseEntity3.getName();
        courseEntity3.setId((long) (byte) -1);
        courseEntity3.setLevel((java.lang.Long) 10L);
        long long23 = courseEntity3.getId();
        basic.TeacherEntity teacherEntity24 = new basic.TeacherEntity();
        java.lang.String str25 = teacherEntity24.getName();
        java.lang.String str26 = teacherEntity24.getName();
        teacherEntity24.setDepartment((java.lang.Long) 0L);
        basic.StudentEntity studentEntity34 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView35 = new functional.view.StudentView(studentEntity34);
        java.lang.Long long36 = studentEntity34.getLevel();
        java.lang.Class<?> wildcardClass37 = studentEntity34.getClass();
        boolean boolean38 = teacherEntity24.equals((java.lang.Object) studentEntity34);
        boolean boolean39 = courseEntity3.equals((java.lang.Object) teacherEntity24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity9.setDescription("");
        boolean boolean12 = subjectEntity9.validation();
        subjectEntity9.setDescription("");
        subjectEntity9.setCourse((java.lang.Long) 0L);
        subjectEntity9.setCredit((java.lang.Long) 1L);
        subjectEntity9.setWorkload((java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        functional.Matriculation matriculation0 = new functional.Matriculation();
        java.lang.Boolean boolean1 = matriculation0.doMatriculation();
        java.util.List<basic.StudentEntity> studentEntityList2 = matriculation0.getStudentAvailable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntityList2);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        functional.Matriculation matriculation0 = new functional.Matriculation();
        java.lang.Boolean boolean1 = matriculation0.doMatriculation();
        java.lang.Boolean boolean2 = matriculation0.doMatriculation();
        dao.StudentDao studentDao3 = null;
        matriculation0.setStudentDao(studentDao3);
        java.util.List<basic.SubjectEntity> subjectEntityList5 = matriculation0.getSubjects();
        functional.Matriculation matriculation6 = new functional.Matriculation();
        dao.StudentDao studentDao7 = matriculation6.getStudentDao();
        basic.StudentEntity studentEntity13 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView14 = new functional.view.StudentView(studentEntity13);
        java.lang.Long long15 = studentEntity13.getLevel();
        java.lang.Long long16 = studentEntity13.getLevel();
        basic.StudentEntity studentEntity22 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView23 = new functional.view.StudentView(studentEntity22);
        basic.StudentEntity studentEntity24 = studentView23.getStudentEntity();
        basic.StudentEntity studentEntity25 = studentView23.getStudentEntity();
        java.lang.Long long26 = studentEntity25.getLevel();
        basic.SubjectEntity subjectEntity36 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity36.setDescription("");
        subjectEntity36.setWorkload((java.lang.Integer) 100);
        basic.StudentEntity studentEntity46 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView47 = new functional.view.StudentView(studentEntity46);
        basic.StudentEntity studentEntity48 = studentView47.getStudentEntity();
        basic.StudentEntity studentEntity49 = studentView47.getStudentEntity();
        basic.StudentEntity studentEntity50 = studentView47.getStudentEntity();
        boolean boolean51 = subjectEntity36.equals((java.lang.Object) studentEntity50);
        java.lang.String str52 = studentEntity50.getRegistration();
        basic.StudentEntity studentEntity53 = new basic.StudentEntity();
        studentEntity53.setId((long) (byte) 0);
        basic.StudentEntity studentEntity61 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.String str62 = studentEntity61.getRegistration();
        studentEntity61.setCourse((java.lang.Long) (-1L));
        java.lang.Long long65 = studentEntity61.getCourse();
        functional.view.StudentView studentView66 = new functional.view.StudentView(studentEntity61);
        basic.StudentEntity studentEntity72 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long73 = studentEntity72.getCourse();
        java.lang.Long long74 = studentEntity72.getLevel();
        studentView66.setStudentEntity(studentEntity72);
        basic.StudentEntity studentEntity81 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView82 = new functional.view.StudentView(studentEntity81);
        basic.StudentEntity studentEntity83 = studentView82.getStudentEntity();
        java.lang.String str84 = studentEntity83.getRegistration();
        basic.StudentEntity[] studentEntityArray85 = new basic.StudentEntity[]{studentEntity13, studentEntity25, studentEntity50, studentEntity53, studentEntity72, studentEntity83};
        java.util.ArrayList<basic.StudentEntity> studentEntityList86 = new java.util.ArrayList<basic.StudentEntity>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<basic.StudentEntity>) studentEntityList86, studentEntityArray85);
        matriculation6.setStudentAvailable((java.util.List<basic.StudentEntity>) studentEntityList86);
        matriculation0.setStudentAvailable((java.util.List<basic.StudentEntity>) studentEntityList86);
        basic.StudentEntity studentEntity90 = matriculation0.getSelectedStudent();
        java.util.List<basic.StudentEntity> studentEntityList91 = matriculation0.getStudentAvailable();
        functional.Matriculation matriculation92 = new functional.Matriculation();
        basic.StudentEntity studentEntity93 = matriculation92.getSelectedStudent();
        java.util.List<basic.StudentEntity> studentEntityList94 = null;
        matriculation92.setStudentAvailable(studentEntityList94);
        java.util.List<basic.SubjectEntity> subjectEntityList96 = matriculation92.getOffer();
        dao.StudentDao studentDao97 = matriculation92.getStudentDao();
        matriculation0.setStudentDao(studentDao97);
        basic.StudentEntity studentEntity99 = matriculation0.getSelectedStudent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntityList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "" + "'", str62.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + (-1L) + "'", long65.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 10L + "'", long73.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 1L + "'", long74.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "" + "'", str84.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntityArray85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntityList91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntityList96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity99);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        functional.view.SecretaryView secretaryView0 = new functional.view.SecretaryView();
        basic.SecretaryEntity secretaryEntity1 = null;
        secretaryView0.setSecretaryEntity(secretaryEntity1);
        java.lang.String str3 = secretaryView0.toString();
        java.lang.String str4 = secretaryView0.toString();
        basic.SecretaryEntity secretaryEntity5 = secretaryView0.getSecretaryEntity();
        basic.SecretaryEntity secretaryEntity9 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity9.setName("");
        secretaryEntity9.setName("");
        secretaryEntity9.setName("");
        java.lang.String str16 = secretaryEntity9.getName();
        secretaryEntity9.setLevel((java.lang.Long) 0L);
        secretaryView0.setSecretaryEntity(secretaryEntity9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = secretaryView0.toString();
            org.junit.Assert.fail("Expected exception of type org.hibernate.service.spi.ServiceException; message: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]");
        } catch (org.hibernate.service.spi.ServiceException e) {
            // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(secretaryEntity5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView6 = new functional.view.StudentView(studentEntity5);
        basic.StudentEntity studentEntity7 = studentView6.getStudentEntity();
        basic.StudentEntity studentEntity13 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView14 = new functional.view.StudentView(studentEntity13);
        java.lang.Long long15 = studentEntity13.getLevel();
        java.lang.String str16 = studentEntity13.getRegistration();
        studentView6.setStudentEntity(studentEntity13);
        java.lang.String str18 = studentEntity13.getRegistration();
        boolean boolean20 = studentEntity13.equals((java.lang.Object) 100L);
        functional.view.StudentView studentView21 = new functional.view.StudentView(studentEntity13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView6 = new functional.view.StudentView(studentEntity5);
        basic.StudentEntity studentEntity7 = studentView6.getStudentEntity();
        java.lang.Long long8 = studentEntity7.getCourse();
        java.lang.String str9 = studentEntity7.getRegistration();
        boolean boolean10 = studentEntity7.validation();
        studentEntity7.setName("hi!");
        functional.Matriculation matriculation13 = new functional.Matriculation();
        basic.StudentEntity studentEntity14 = matriculation13.getSelectedStudent();
        java.util.List<basic.StudentEntity> studentEntityList15 = null;
        matriculation13.setStudentAvailable(studentEntityList15);
        dao.StudentDao studentDao17 = null;
        matriculation13.setStudentDao(studentDao17);
        java.util.List<basic.StudentEntity> studentEntityList19 = matriculation13.start();
        java.util.List<basic.SubjectEntity> subjectEntityList20 = matriculation13.getOffer();
        dao.StudentDao studentDao21 = matriculation13.getStudentDao();
        boolean boolean22 = studentEntity7.equals((java.lang.Object) matriculation13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntityList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntityList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentDao21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        relationship.RequirementCreditRelationship requirementCreditRelationship2 = new relationship.RequirementCreditRelationship((java.lang.Long) 1L, (java.lang.Long) 1L);
        requirementCreditRelationship2.setSubject((java.lang.Long) 100L);
        requirementCreditRelationship2.setCredit((java.lang.Long) 1L);
        java.lang.Long long7 = requirementCreditRelationship2.getSubject();
        requirementCreditRelationship2.setCredit((java.lang.Long) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7.equals(100L));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        functional.Matriculation matriculation0 = new functional.Matriculation();
        java.lang.Boolean boolean1 = matriculation0.doMatriculation();
        java.lang.Boolean boolean2 = matriculation0.doMatriculation();
        dao.StudentDao studentDao3 = null;
        matriculation0.setStudentDao(studentDao3);
        java.util.List<basic.SubjectEntity> subjectEntityList5 = matriculation0.getSubjects();
        java.util.List<basic.SubjectEntity> subjectEntityList6 = matriculation0.getSubjects();
        java.util.List<basic.StudentEntity> studentEntityList7 = matriculation0.getStudentAvailable();
        java.lang.Boolean boolean8 = matriculation0.doMatriculation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntityList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntityList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntityList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship0 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship0.setSubject((java.lang.Long) 0L);
        requirementSubjectRelationship0.setParent((java.lang.Long) 10L);
        relationship.ApprovedRelationship approvedRelationship7 = new relationship.ApprovedRelationship((java.lang.Long) (-1L), (java.lang.Long) 0L);
        java.lang.Long long8 = approvedRelationship7.getStudent();
        approvedRelationship7.setSubject((java.lang.Long) 100L);
        boolean boolean11 = requirementSubjectRelationship0.equals((java.lang.Object) 100L);
        java.lang.Long long12 = requirementSubjectRelationship0.getParent();
        requirementSubjectRelationship0.setParent((java.lang.Long) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12.equals(10L));
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        functional.Matriculation matriculation0 = new functional.Matriculation();
        basic.StudentEntity studentEntity1 = matriculation0.getSelectedStudent();
        java.util.List<basic.StudentEntity> studentEntityList2 = null;
        matriculation0.setStudentAvailable(studentEntityList2);
        dao.StudentDao studentDao4 = null;
        matriculation0.setStudentDao(studentDao4);
        java.util.List<basic.StudentEntity> studentEntityList6 = matriculation0.start();
        java.util.List<basic.SubjectEntity> subjectEntityList7 = matriculation0.getOffer();
        java.util.List<basic.SubjectEntity> subjectEntityList8 = matriculation0.getOffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntityList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntityList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntityList8);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView6 = new functional.view.StudentView(studentEntity5);
        studentEntity5.setCourse((java.lang.Long) 0L);
        functional.view.StudentView studentView9 = new functional.view.StudentView(studentEntity5);
        functional.view.StudentView studentView10 = new functional.view.StudentView(studentEntity5);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) 100L, "", (java.lang.Long) 10L);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        basic.SubjectEntity subjectEntity0 = new basic.SubjectEntity();
        java.lang.String str1 = subjectEntity0.getDescription();
        java.lang.Long long2 = subjectEntity0.getResponsibleTeacher();
        subjectEntity0.setDescription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        relationship.RequirementCreditRelationship requirementCreditRelationship2 = new relationship.RequirementCreditRelationship((java.lang.Long) 1L, (java.lang.Long) 10L);
        requirementCreditRelationship2.setId((long) (short) 100);
        requirementCreditRelationship2.setCredit((java.lang.Long) 0L);
        functional.view.SecretaryView secretaryView7 = new functional.view.SecretaryView();
        basic.SecretaryEntity secretaryEntity11 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity11.setName("");
        secretaryView7.setSecretaryEntity(secretaryEntity11);
        basic.SecretaryEntity secretaryEntity15 = new basic.SecretaryEntity();
        secretaryEntity15.setLevel((java.lang.Long) 10L);
        secretaryView7.setSecretaryEntity(secretaryEntity15);
        boolean boolean19 = requirementCreditRelationship2.equals((java.lang.Object) secretaryView7);
        requirementCreditRelationship2.setSubject((java.lang.Long) 1L);
        requirementCreditRelationship2.setId((long) (short) 10);
        long long24 = requirementCreditRelationship2.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList2 = offeredFilter0.fromCourse((java.lang.Long) 32L);
            org.junit.Assert.fail("Expected exception of type org.hibernate.service.spi.ServiceException; message: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]");
        } catch (org.hibernate.service.spi.ServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        basic.SecretaryEntity secretaryEntity0 = new basic.SecretaryEntity();
        secretaryEntity0.setDepartment((java.lang.Long) (-1L));
        java.lang.Long long3 = secretaryEntity0.getLevel();
        java.lang.String str4 = secretaryEntity0.getName();
        secretaryEntity0.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) (-1L), "hi!", (java.lang.Long) 0L);
        basic.DepartmentEntity departmentEntity4 = new basic.DepartmentEntity();
        boolean boolean6 = departmentEntity4.equals((java.lang.Object) 1L);
        departmentEntity4.setName("");
        departmentEntity4.setName("hi!");
        boolean boolean12 = departmentEntity4.equals((java.lang.Object) (byte) -1);
        java.lang.Long long13 = departmentEntity4.getResponsible();
        departmentEntity4.setId(0L);
        boolean boolean16 = secretaryEntity3.equals((java.lang.Object) departmentEntity4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        relationship.ApprovedRelationship approvedRelationship2 = new relationship.ApprovedRelationship((java.lang.Long) (-1L), (java.lang.Long) 0L);
        java.lang.Long long3 = approvedRelationship2.getStudent();
        approvedRelationship2.setSubject((java.lang.Long) 0L);
        java.lang.Long long6 = approvedRelationship2.getSubject();
        approvedRelationship2.setStudent((java.lang.Long) 10L);
        java.lang.Long long9 = approvedRelationship2.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity3.setLevel((java.lang.Long) 0L);
        secretaryEntity3.setName("hi!");
        java.lang.String str8 = secretaryEntity3.getName();
        long long9 = secretaryEntity3.getId();
        secretaryEntity3.setId((long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        basic.TeacherEntity teacherEntity2 = new basic.TeacherEntity("", (java.lang.Long) 0L);
        basic.SubjectEntity subjectEntity12 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity12.setDescription("");
        subjectEntity12.setWorkload((java.lang.Integer) 100);
        basic.StudentEntity studentEntity22 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView23 = new functional.view.StudentView(studentEntity22);
        basic.StudentEntity studentEntity24 = studentView23.getStudentEntity();
        basic.StudentEntity studentEntity25 = studentView23.getStudentEntity();
        basic.StudentEntity studentEntity26 = studentView23.getStudentEntity();
        boolean boolean27 = subjectEntity12.equals((java.lang.Object) studentEntity26);
        subjectEntity12.setBinding((java.lang.Boolean) true);
        subjectEntity12.setResponsibleTeacher((java.lang.Long) 0L);
        boolean boolean32 = teacherEntity2.equals((java.lang.Object) subjectEntity12);
        relationship.RequirementCreditRelationship requirementCreditRelationship35 = new relationship.RequirementCreditRelationship((java.lang.Long) 1L, (java.lang.Long) 10L);
        requirementCreditRelationship35.setId((long) (short) 100);
        requirementCreditRelationship35.setCredit((java.lang.Long) 0L);
        functional.view.SecretaryView secretaryView40 = new functional.view.SecretaryView();
        basic.SecretaryEntity secretaryEntity44 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity44.setName("");
        secretaryView40.setSecretaryEntity(secretaryEntity44);
        basic.SecretaryEntity secretaryEntity48 = new basic.SecretaryEntity();
        secretaryEntity48.setLevel((java.lang.Long) 10L);
        secretaryView40.setSecretaryEntity(secretaryEntity48);
        boolean boolean52 = requirementCreditRelationship35.equals((java.lang.Object) secretaryView40);
        requirementCreditRelationship35.setSubject((java.lang.Long) 1L);
        long long55 = requirementCreditRelationship35.getId();
        boolean boolean56 = teacherEntity2.equals((java.lang.Object) long55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 100L + "'", long55 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("", "", (java.lang.Long) (-1L), (java.lang.Long) 100L, "hi!");
        functional.view.StudentView studentView6 = new functional.view.StudentView(studentEntity5);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        relationship.RequirementCreditRelationship requirementCreditRelationship2 = new relationship.RequirementCreditRelationship((java.lang.Long) 0L, (java.lang.Long) (-1L));
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        relationship.OfferedRelationship offeredRelationship2 = new relationship.OfferedRelationship((java.lang.Long) 100L, (java.lang.Long) 10L);
        offeredRelationship2.setId(1L);
        offeredRelationship2.setId((long) (short) 0);
        java.lang.Object obj7 = null;
        boolean boolean8 = offeredRelationship2.equals(obj7);
        basic.StudentEntity studentEntity14 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView15 = new functional.view.StudentView(studentEntity14);
        basic.StudentEntity studentEntity16 = studentView15.getStudentEntity();
        java.lang.Long long17 = studentEntity16.getCourse();
        java.lang.String str18 = studentEntity16.getRegistration();
        boolean boolean19 = offeredRelationship2.equals((java.lang.Object) str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        basic.CourseEntity courseEntity7 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long8 = courseEntity7.getId();
        boolean boolean9 = courseEntity7.validation();
        courseEntity7.setId((long) (short) 0);
        relationship.MatriculateRelationship matriculateRelationship14 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        long long15 = matriculateRelationship14.getId();
        matriculateRelationship14.setStudent((java.lang.Long) 10L);
        boolean boolean18 = courseEntity7.equals((java.lang.Object) 10L);
        courseEntity7.setDepartment((java.lang.Long) 0L);
        java.lang.Long long21 = courseEntity7.getDepartment();
        courseEntity7.setId((long) '#');
        boolean boolean24 = courseEntity3.equals((java.lang.Object) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        relationship.RequirementCreditRelationship requirementCreditRelationship2 = new relationship.RequirementCreditRelationship((java.lang.Long) 1L, (java.lang.Long) 10L);
        requirementCreditRelationship2.setCredit((java.lang.Long) 1L);
        requirementCreditRelationship2.setSubject((java.lang.Long) 10L);
        java.lang.Long long7 = requirementCreditRelationship2.getSubject();
        requirementCreditRelationship2.setSubject((java.lang.Long) (-1L));
        relationship.ApprovedRelationship approvedRelationship12 = new relationship.ApprovedRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        approvedRelationship12.setId((java.lang.Long) 10L);
        boolean boolean15 = requirementCreditRelationship2.equals((java.lang.Object) approvedRelationship12);
        requirementCreditRelationship2.setId((-1L));
        basic.CourseEntity courseEntity21 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        courseEntity21.setLevel((java.lang.Long) 1L);
        courseEntity21.setLevel((java.lang.Long) (-1L));
        courseEntity21.setId(0L);
        boolean boolean28 = requirementCreditRelationship2.equals((java.lang.Object) courseEntity21);
        requirementCreditRelationship2.setId((long) '4');
        java.lang.Long long31 = requirementCreditRelationship2.getSubject();
        requirementCreditRelationship2.setCredit((java.lang.Long) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31.equals((-1L)));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        java.lang.Long long10 = subjectEntity9.getCourse();
        subjectEntity9.setId((long) (byte) 10);
        boolean boolean13 = subjectEntity9.validation();
        boolean boolean14 = subjectEntity9.isNull();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 100L, (java.lang.Integer) 10, (java.lang.Boolean) false, (java.lang.Long) (-1L), (java.lang.Long) 100L, "");
        subjectEntity9.setBinding((java.lang.Boolean) false);
        relationship.filter.MatriculateFilter matriculateFilter12 = new relationship.filter.MatriculateFilter();
        boolean boolean13 = subjectEntity9.equals((java.lang.Object) matriculateFilter12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<relationship.MatriculateRelationship> matriculateRelationshipList15 = matriculateFilter12.subjectMatriculateFrom((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type org.hibernate.service.spi.ServiceException; message: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]");
        } catch (org.hibernate.service.spi.ServiceException e) {
            // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        functional.Matriculation matriculation0 = new functional.Matriculation();
        basic.StudentEntity studentEntity1 = matriculation0.getSelectedStudent();
        basic.StudentEntity studentEntity2 = new basic.StudentEntity();
        matriculation0.setSelectedStudent(studentEntity2);
        java.util.List<basic.SubjectEntity> subjectEntityList4 = matriculation0.getOffer();
        basic.StudentEntity studentEntity5 = matriculation0.getSelectedStudent();
        java.lang.Boolean boolean6 = matriculation0.doMatriculation();
        dao.StudentDao studentDao7 = matriculation0.getStudentDao();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntityList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao7);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        functional.view.SubjectView subjectView0 = new functional.view.SubjectView();
        basic.SubjectEntity subjectEntity1 = subjectView0.getSubjectEntity();
        basic.SubjectEntity subjectEntity2 = new basic.SubjectEntity();
        subjectView0.setSubjectEntity(subjectEntity2);
        basic.SubjectEntity subjectEntity4 = subjectView0.getSubjectEntity();
        long long5 = subjectEntity4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntity1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(subjectEntity4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity9.setDescription("");
        boolean boolean12 = subjectEntity9.validation();
        subjectEntity9.setDescription("");
        subjectEntity9.setCourse((java.lang.Long) 0L);
        java.lang.String str17 = subjectEntity9.getName();
        subjectEntity9.setDescription("");
        java.lang.Long long20 = subjectEntity9.getLevel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20.equals(1L));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        basic.TeacherEntity teacherEntity0 = new basic.TeacherEntity();
        teacherEntity0.setId((long) 10);
        basic.SubjectEntity subjectEntity12 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 0L, (java.lang.Long) 100L, (java.lang.Integer) (-1), (java.lang.Boolean) false, (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        boolean boolean13 = subjectEntity12.isNull();
        basic.StudentEntity studentEntity19 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        boolean boolean20 = subjectEntity12.equals((java.lang.Object) "");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship21 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship21.setSubject((java.lang.Long) 0L);
        boolean boolean24 = subjectEntity12.equals((java.lang.Object) 0L);
        boolean boolean25 = teacherEntity0.equals((java.lang.Object) boolean24);
        java.lang.String str26 = teacherEntity0.getName();
        teacherEntity0.setId((long) (short) -1);
        long long29 = teacherEntity0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity3.setName("");
        secretaryEntity3.setName("");
        secretaryEntity3.setName("");
        java.lang.String str10 = secretaryEntity3.getName();
        secretaryEntity3.setId((long) (byte) 1);
        secretaryEntity3.setName("hi!");
        java.lang.Long long15 = secretaryEntity3.getDepartment();
        secretaryEntity3.setId((long) ' ');
        java.lang.Long long18 = secretaryEntity3.getLevel();
        secretaryEntity3.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18.equals(0L));
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        functional.Matriculation matriculation0 = new functional.Matriculation();
        basic.StudentEntity studentEntity1 = matriculation0.getSelectedStudent();
        dao.StudentDao studentDao2 = matriculation0.getStudentDao();
        basic.StudentEntity studentEntity3 = matriculation0.getSelectedStudent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity3);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        relationship.RequirementCreditRelationship requirementCreditRelationship2 = new relationship.RequirementCreditRelationship((java.lang.Long) 10L, (java.lang.Long) 10L);
        java.lang.Long long3 = requirementCreditRelationship2.getCredit();
        java.lang.Long long4 = requirementCreditRelationship2.getCredit();
        java.lang.Long long5 = requirementCreditRelationship2.getSubject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5.equals(10L));
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        java.lang.Long long5 = courseEntity3.getDepartment();
        courseEntity3.setLevel((java.lang.Long) (-1L));
        courseEntity3.setDepartment((java.lang.Long) 0L);
        long long10 = courseEntity3.getId();
        boolean boolean11 = courseEntity3.validation();
        java.lang.Long long12 = courseEntity3.getDepartment();
        courseEntity3.setLevel((java.lang.Long) 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12.equals(0L));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        functional.view.SubjectView subjectView0 = new functional.view.SubjectView();
        basic.SubjectEntity subjectEntity1 = subjectView0.getSubjectEntity();
        basic.SubjectEntity subjectEntity2 = new basic.SubjectEntity();
        subjectView0.setSubjectEntity(subjectEntity2);
        long long4 = subjectEntity2.getId();
        subjectEntity2.setName("hi!");
        java.lang.Boolean boolean7 = subjectEntity2.getBinding();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntity1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        java.lang.Long long10 = subjectEntity9.getResponsibleTeacher();
        java.lang.String str11 = subjectEntity9.getCode();
        java.lang.String str12 = subjectEntity9.getDescription();
        boolean boolean13 = subjectEntity9.validation();
        subjectEntity9.setCredit((java.lang.Long) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        relationship.filter.RequirementSubjectFilter requirementSubjectFilter0 = new relationship.filter.RequirementSubjectFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = requirementSubjectFilter0.canEnroll((java.lang.Long) 0L, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type org.hibernate.service.spi.ServiceException; message: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]");
        } catch (org.hibernate.service.spi.ServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        basic.CourseEntity courseEntity0 = new basic.CourseEntity();
        java.lang.Long long1 = courseEntity0.getLevel();
        java.lang.Long long2 = courseEntity0.getDepartment();
        courseEntity0.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        relationship.MatriculateRelationship matriculateRelationship2 = new relationship.MatriculateRelationship((java.lang.Long) 32L, (java.lang.Long) (-1L));
        matriculateRelationship2.setId((long) (short) 1);
        basic.SubjectEntity subjectEntity14 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 0L, (java.lang.Long) 100L, (java.lang.Integer) (-1), (java.lang.Boolean) false, (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.String str15 = subjectEntity14.getName();
        boolean boolean16 = matriculateRelationship2.equals((java.lang.Object) subjectEntity14);
        subjectEntity14.setWorkload((java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        basic.SubjectEntity subjectEntity19 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        java.lang.String str20 = subjectEntity19.getDescription();
        boolean boolean21 = subjectEntity19.isNull();
        subjectEntity19.setCode("");
        boolean boolean24 = subjectEntity9.equals((java.lang.Object) subjectEntity19);
        subjectEntity19.setLevel((java.lang.Long) 100L);
        boolean boolean27 = subjectEntity19.validation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        relationship.ApprovedRelationship approvedRelationship2 = new relationship.ApprovedRelationship((java.lang.Long) 1L, (java.lang.Long) 0L);
        approvedRelationship2.setId((java.lang.Long) (-1L));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long6 = studentEntity5.getCourse();
        studentEntity5.setRegistration("hi!");
        java.lang.Long long9 = studentEntity5.getLevel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9.equals(1L));
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 0L, (java.lang.Long) 0L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 32L, (java.lang.Long) 32L, "");
        boolean boolean10 = subjectEntity9.isNull();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        relationship.ApprovedRelationship approvedRelationship2 = new relationship.ApprovedRelationship((java.lang.Long) (-1L), (java.lang.Long) 1L);
        java.lang.Long long3 = approvedRelationship2.getStudent();
        approvedRelationship2.setStudent((java.lang.Long) 0L);
        basic.TeacherEntity teacherEntity6 = new basic.TeacherEntity();
        java.lang.String str7 = teacherEntity6.getName();
        long long8 = teacherEntity6.getId();
        java.lang.String str9 = teacherEntity6.getName();
        boolean boolean10 = approvedRelationship2.equals((java.lang.Object) str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        relationship.MatriculateRelationship matriculateRelationship0 = new relationship.MatriculateRelationship();
        java.lang.Long long1 = matriculateRelationship0.getSubject();
        matriculateRelationship0.setSubject((java.lang.Long) (-1L));
        java.lang.Long long4 = matriculateRelationship0.getStudent();
        matriculateRelationship0.setId((long) 0);
        java.lang.Long long7 = matriculateRelationship0.getSubject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7.equals((-1L)));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity9.setDescription("");
        boolean boolean12 = subjectEntity9.validation();
        subjectEntity9.setWorkload((java.lang.Integer) 100);
        java.lang.Long long15 = subjectEntity9.getLevel();
        basic.SubjectEntity subjectEntity25 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity25.setDescription("");
        boolean boolean28 = subjectEntity25.validation();
        subjectEntity25.setDescription("");
        subjectEntity25.setCourse((java.lang.Long) 0L);
        boolean boolean33 = subjectEntity9.equals((java.lang.Object) 0L);
        subjectEntity9.setLevel((java.lang.Long) 32L);
        boolean boolean36 = subjectEntity9.isNull();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView6 = new functional.view.StudentView(studentEntity5);
        basic.StudentEntity studentEntity7 = studentView6.getStudentEntity();
        java.lang.Long long8 = studentEntity7.getCourse();
        studentEntity7.setLevel((java.lang.Long) 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8.equals(10L));
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity3.setLevel((java.lang.Long) 0L);
        secretaryEntity3.setName("hi!");
        java.lang.String str8 = secretaryEntity3.getName();
        java.lang.Long long9 = secretaryEntity3.getLevel();
        secretaryEntity3.setId((long) 10);
        java.lang.Long long12 = secretaryEntity3.getDepartment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12.equals(0L));
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity9.setDescription("");
        subjectEntity9.setWorkload((java.lang.Integer) 100);
        subjectEntity9.setDescription("");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        basic.SubjectEntity subjectEntity0 = new basic.SubjectEntity();
        java.lang.Long long1 = subjectEntity0.getResponsibleTeacher();
        long long2 = subjectEntity0.getId();
        java.lang.String str3 = subjectEntity0.getCode();
        subjectEntity0.setCredit((java.lang.Long) (-1L));
        subjectEntity0.setWorkload((java.lang.Integer) (-1));
        boolean boolean8 = subjectEntity0.validation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        basic.DepartmentEntity departmentEntity0 = new basic.DepartmentEntity();
        boolean boolean2 = departmentEntity0.equals((java.lang.Object) 1L);
        departmentEntity0.setName("");
        departmentEntity0.setId(10L);
        basic.StudentEntity studentEntity12 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.String str13 = studentEntity12.getRegistration();
        studentEntity12.setRegistration("");
        boolean boolean16 = departmentEntity0.equals((java.lang.Object) studentEntity12);
        java.lang.String str17 = studentEntity12.getRegistration();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        relationship.MatriculateRelationship matriculateRelationship0 = new relationship.MatriculateRelationship();
        java.lang.Long long1 = matriculateRelationship0.getSubject();
        java.lang.Long long2 = matriculateRelationship0.getStudent();
        relationship.RequirementCreditRelationship requirementCreditRelationship5 = new relationship.RequirementCreditRelationship((java.lang.Long) 1L, (java.lang.Long) 10L);
        requirementCreditRelationship5.setCredit((java.lang.Long) 1L);
        requirementCreditRelationship5.setSubject((java.lang.Long) 10L);
        java.lang.Long long10 = requirementCreditRelationship5.getSubject();
        requirementCreditRelationship5.setSubject((java.lang.Long) (-1L));
        long long13 = requirementCreditRelationship5.getId();
        basic.StudentEntity studentEntity19 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long20 = studentEntity19.getCourse();
        studentEntity19.setRegistration("hi!");
        boolean boolean23 = requirementCreditRelationship5.equals((java.lang.Object) studentEntity19);
        boolean boolean24 = matriculateRelationship0.equals((java.lang.Object) boolean23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship0 = new relationship.RequirementSubjectRelationship();
        java.lang.Long long1 = requirementSubjectRelationship0.getSubject();
        requirementSubjectRelationship0.setSubject((java.lang.Long) 0L);
        requirementSubjectRelationship0.setSubject((java.lang.Long) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship2 = new relationship.RequirementSubjectRelationship((java.lang.Long) 0L, (java.lang.Long) 10L);
        long long3 = requirementSubjectRelationship2.getId();
        java.lang.Long long4 = requirementSubjectRelationship2.getSubject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4.equals(10L));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        relationship.filter.RequirementSubjectFilter requirementSubjectFilter0 = new relationship.filter.RequirementSubjectFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = requirementSubjectFilter0.canEnroll((java.lang.Long) 52L, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type org.hibernate.service.spi.ServiceException; message: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]");
        } catch (org.hibernate.service.spi.ServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        relationship.OfferedRelationship offeredRelationship2 = new relationship.OfferedRelationship((java.lang.Long) 100L, (java.lang.Long) 10L);
        offeredRelationship2.setId(1L);
        offeredRelationship2.setCourse((java.lang.Long) 1L);
        basic.StudentEntity studentEntity12 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long13 = studentEntity12.getCourse();
        functional.view.StudentView studentView14 = new functional.view.StudentView(studentEntity12);
        boolean boolean15 = offeredRelationship2.equals((java.lang.Object) studentView14);
        basic.SubjectEntity subjectEntity25 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity25.setDescription("");
        boolean boolean28 = subjectEntity25.validation();
        subjectEntity25.setDescription("");
        boolean boolean31 = offeredRelationship2.equals((java.lang.Object) subjectEntity25);
        long long32 = offeredRelationship2.getId();
        long long33 = offeredRelationship2.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("hi!", (java.lang.Long) 100L, (java.lang.Long) 32L);
        boolean boolean4 = courseEntity3.validation();
        courseEntity3.setLevel((java.lang.Long) 0L);
        courseEntity3.setLevel((java.lang.Long) 52L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship0 = new relationship.RequirementSubjectRelationship();
        basic.StudentEntity studentEntity6 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long7 = studentEntity6.getCourse();
        functional.view.StudentView studentView8 = new functional.view.StudentView(studentEntity6);
        boolean boolean9 = requirementSubjectRelationship0.equals((java.lang.Object) studentView8);
        basic.StudentEntity studentEntity15 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView16 = new functional.view.StudentView(studentEntity15);
        basic.StudentEntity studentEntity17 = studentView16.getStudentEntity();
        java.lang.Long long18 = studentEntity17.getCourse();
        java.lang.String str19 = studentEntity17.getRegistration();
        boolean boolean20 = studentEntity17.validation();
        studentView8.setStudentEntity(studentEntity17);
        basic.StudentEntity studentEntity27 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.String str28 = studentEntity27.getRegistration();
        java.lang.String str29 = studentEntity27.getName();
        boolean boolean30 = studentEntity27.validation();
        studentView8.setStudentEntity(studentEntity27);
        studentEntity27.setName("");
        long long34 = studentEntity27.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship0 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship0.setSubject((java.lang.Long) 0L);
        boolean boolean4 = requirementSubjectRelationship0.equals((java.lang.Object) (short) -1);
        java.lang.Long long5 = requirementSubjectRelationship0.getSubject();
        requirementSubjectRelationship0.setSubject((java.lang.Long) 0L);
        relationship.RequirementSubjectRelationship requirementSubjectRelationship8 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship8.setSubject((java.lang.Long) 0L);
        boolean boolean12 = requirementSubjectRelationship8.equals((java.lang.Object) (short) -1);
        java.lang.Long long13 = requirementSubjectRelationship8.getSubject();
        requirementSubjectRelationship8.setSubject((java.lang.Long) 0L);
        long long16 = requirementSubjectRelationship8.getId();
        requirementSubjectRelationship8.setSubject((java.lang.Long) 0L);
        boolean boolean19 = requirementSubjectRelationship0.equals((java.lang.Object) requirementSubjectRelationship8);
        requirementSubjectRelationship0.setId((long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        boolean boolean5 = courseEntity3.validation();
        courseEntity3.setId((long) (short) 0);
        relationship.RequirementSubjectRelationship requirementSubjectRelationship8 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship8.setSubject((java.lang.Long) 0L);
        requirementSubjectRelationship8.setParent((java.lang.Long) 10L);
        requirementSubjectRelationship8.setSubject((java.lang.Long) 100L);
        requirementSubjectRelationship8.setId(10L);
        boolean boolean17 = courseEntity3.equals((java.lang.Object) requirementSubjectRelationship8);
        java.lang.String str18 = courseEntity3.getName();
        courseEntity3.setId((long) (byte) -1);
        long long21 = courseEntity3.getId();
        boolean boolean22 = courseEntity3.validation();
        java.lang.Long long23 = courseEntity3.getLevel();
        java.lang.Long long24 = courseEntity3.getLevel();
        java.lang.Object obj25 = null;
        boolean boolean26 = courseEntity3.equals(obj25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        basic.DepartmentEntity departmentEntity0 = new basic.DepartmentEntity();
        boolean boolean2 = departmentEntity0.equals((java.lang.Object) 1L);
        departmentEntity0.setName("");
        departmentEntity0.setName("hi!");
        departmentEntity0.setId((long) (byte) 0);
        departmentEntity0.setId((long) (short) -1);
        long long11 = departmentEntity0.getId();
        long long12 = departmentEntity0.getId();
        long long13 = departmentEntity0.getId();
        departmentEntity0.setResponsible((java.lang.Long) (-1L));
        long long16 = departmentEntity0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long6 = studentEntity5.getCourse();
        java.lang.Long long7 = studentEntity5.getLevel();
        java.lang.Long long8 = studentEntity5.getLevel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8.equals(1L));
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView6 = new functional.view.StudentView(studentEntity5);
        studentEntity5.setId((long) 1);
        functional.view.StudentView studentView9 = new functional.view.StudentView(studentEntity5);
        functional.view.StudentView studentView10 = new functional.view.StudentView(studentEntity5);
        basic.StudentEntity studentEntity11 = studentView10.getStudentEntity();
        basic.StudentEntity studentEntity12 = studentView10.getStudentEntity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity12);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        relationship.RequirementCreditRelationship requirementCreditRelationship2 = new relationship.RequirementCreditRelationship((java.lang.Long) 0L, (java.lang.Long) 32L);
        requirementCreditRelationship2.setId((long) 1);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long6 = studentEntity5.getCourse();
        functional.view.StudentView studentView7 = new functional.view.StudentView(studentEntity5);
        functional.Matriculation matriculation8 = new functional.Matriculation();
        dao.StudentDao studentDao9 = matriculation8.getStudentDao();
        boolean boolean10 = studentEntity5.equals((java.lang.Object) matriculation8);
        basic.CourseEntity courseEntity14 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long15 = courseEntity14.getId();
        boolean boolean16 = courseEntity14.validation();
        courseEntity14.setId((long) (short) 0);
        relationship.MatriculateRelationship matriculateRelationship21 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        long long22 = matriculateRelationship21.getId();
        matriculateRelationship21.setStudent((java.lang.Long) 10L);
        boolean boolean25 = courseEntity14.equals((java.lang.Object) 10L);
        courseEntity14.setDepartment((java.lang.Long) 0L);
        functional.Matriculation matriculation28 = new functional.Matriculation();
        dao.StudentDao studentDao29 = matriculation28.getStudentDao();
        boolean boolean30 = courseEntity14.equals((java.lang.Object) matriculation28);
        functional.Matriculation matriculation31 = new functional.Matriculation();
        basic.StudentEntity studentEntity32 = matriculation31.getSelectedStudent();
        dao.StudentDao studentDao33 = matriculation31.getStudentDao();
        matriculation28.setStudentDao(studentDao33);
        matriculation8.setStudentDao(studentDao33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao33);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) 0L, "hi!", (java.lang.Long) 0L);
        relationship.ApprovedRelationship approvedRelationship6 = new relationship.ApprovedRelationship((java.lang.Long) 100L, (java.lang.Long) 0L);
        boolean boolean7 = secretaryEntity3.equals((java.lang.Object) approvedRelationship6);
        approvedRelationship6.setId((java.lang.Long) 100L);
        approvedRelationship6.setStudent((java.lang.Long) 1L);
        java.lang.Long long12 = approvedRelationship6.getSubject();
        java.lang.Long long13 = approvedRelationship6.getSubject();
        java.lang.Long long14 = approvedRelationship6.getSubject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14.equals(0L));
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("hi!", (java.lang.Long) 0L, (java.lang.Long) 10L);
        java.lang.Long long4 = courseEntity3.getDepartment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4.equals(10L));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        functional.view.SecretaryView secretaryView0 = new functional.view.SecretaryView();
        basic.SecretaryEntity secretaryEntity4 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity4.setName("");
        secretaryView0.setSecretaryEntity(secretaryEntity4);
        basic.SecretaryEntity secretaryEntity8 = new basic.SecretaryEntity();
        secretaryEntity8.setLevel((java.lang.Long) 10L);
        secretaryView0.setSecretaryEntity(secretaryEntity8);
        java.lang.String str12 = secretaryView0.toString();
        basic.SecretaryEntity secretaryEntity16 = new basic.SecretaryEntity((java.lang.Long) 10L, "hi!", (java.lang.Long) (-1L));
        basic.CourseEntity courseEntity20 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long21 = courseEntity20.getId();
        courseEntity20.setId((long) (byte) 100);
        java.lang.Long long24 = courseEntity20.getLevel();
        boolean boolean25 = secretaryEntity16.equals((java.lang.Object) long24);
        secretaryView0.setSecretaryEntity(secretaryEntity16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = secretaryView0.toString();
            org.junit.Assert.fail("Expected exception of type org.hibernate.service.spi.ServiceException; message: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]");
        } catch (org.hibernate.service.spi.ServiceException e) {
            // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        functional.view.SecretaryView secretaryView0 = new functional.view.SecretaryView();
        basic.SecretaryEntity secretaryEntity1 = null;
        secretaryView0.setSecretaryEntity(secretaryEntity1);
        java.lang.String str3 = secretaryView0.toString();
        basic.SecretaryEntity secretaryEntity4 = secretaryView0.getSecretaryEntity();
        java.lang.String str5 = secretaryView0.toString();
        basic.SecretaryEntity secretaryEntity6 = secretaryView0.getSecretaryEntity();
        java.lang.String str7 = secretaryView0.toString();
        functional.view.SecretaryView secretaryView8 = new functional.view.SecretaryView();
        java.lang.String str9 = secretaryView8.toString();
        basic.CourseEntity courseEntity13 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long14 = courseEntity13.getId();
        boolean boolean15 = courseEntity13.validation();
        courseEntity13.setId((long) (short) 0);
        relationship.MatriculateRelationship matriculateRelationship20 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        long long21 = matriculateRelationship20.getId();
        matriculateRelationship20.setStudent((java.lang.Long) 10L);
        boolean boolean24 = courseEntity13.equals((java.lang.Object) 10L);
        courseEntity13.setName("hi!");
        functional.view.SecretaryView secretaryView27 = new functional.view.SecretaryView();
        basic.SecretaryEntity secretaryEntity31 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity31.setName("");
        secretaryView27.setSecretaryEntity(secretaryEntity31);
        basic.SecretaryEntity secretaryEntity35 = new basic.SecretaryEntity();
        secretaryEntity35.setLevel((java.lang.Long) 10L);
        secretaryView27.setSecretaryEntity(secretaryEntity35);
        long long39 = secretaryEntity35.getId();
        boolean boolean40 = courseEntity13.equals((java.lang.Object) secretaryEntity35);
        secretaryView8.setSecretaryEntity(secretaryEntity35);
        secretaryView0.setSecretaryEntity(secretaryEntity35);
        java.lang.Long long43 = secretaryEntity35.getDepartment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(secretaryEntity4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(secretaryEntity6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long43);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        relationship.ApprovedRelationship approvedRelationship2 = new relationship.ApprovedRelationship((java.lang.Long) (-1L), (java.lang.Long) 0L);
        java.lang.Long long3 = approvedRelationship2.getStudent();
        java.lang.Long long4 = approvedRelationship2.getId();
        java.lang.Long long5 = approvedRelationship2.getSubject();
        approvedRelationship2.setSubject((java.lang.Long) 0L);
        approvedRelationship2.setSubject((java.lang.Long) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5.equals(0L));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 1L, (java.lang.Long) 1L, (java.lang.Integer) (-1), (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) 1L, "hi!");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        functional.Matriculation matriculation0 = new functional.Matriculation();
        basic.StudentEntity studentEntity1 = matriculation0.getSelectedStudent();
        java.util.List<basic.StudentEntity> studentEntityList2 = null;
        matriculation0.setStudentAvailable(studentEntityList2);
        dao.StudentDao studentDao4 = null;
        matriculation0.setStudentDao(studentDao4);
        java.util.List<basic.SubjectEntity> subjectEntityList6 = matriculation0.getSubjects();
        basic.StudentEntity studentEntity7 = matriculation0.getSelectedStudent();
        functional.Matriculation matriculation8 = new functional.Matriculation();
        dao.StudentDao studentDao9 = matriculation8.getStudentDao();
        basic.StudentEntity studentEntity15 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView16 = new functional.view.StudentView(studentEntity15);
        java.lang.Long long17 = studentEntity15.getLevel();
        java.lang.Long long18 = studentEntity15.getLevel();
        basic.StudentEntity studentEntity24 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView25 = new functional.view.StudentView(studentEntity24);
        basic.StudentEntity studentEntity26 = studentView25.getStudentEntity();
        basic.StudentEntity studentEntity27 = studentView25.getStudentEntity();
        java.lang.Long long28 = studentEntity27.getLevel();
        basic.SubjectEntity subjectEntity38 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity38.setDescription("");
        subjectEntity38.setWorkload((java.lang.Integer) 100);
        basic.StudentEntity studentEntity48 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView49 = new functional.view.StudentView(studentEntity48);
        basic.StudentEntity studentEntity50 = studentView49.getStudentEntity();
        basic.StudentEntity studentEntity51 = studentView49.getStudentEntity();
        basic.StudentEntity studentEntity52 = studentView49.getStudentEntity();
        boolean boolean53 = subjectEntity38.equals((java.lang.Object) studentEntity52);
        java.lang.String str54 = studentEntity52.getRegistration();
        basic.StudentEntity studentEntity55 = new basic.StudentEntity();
        studentEntity55.setId((long) (byte) 0);
        basic.StudentEntity studentEntity63 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.String str64 = studentEntity63.getRegistration();
        studentEntity63.setCourse((java.lang.Long) (-1L));
        java.lang.Long long67 = studentEntity63.getCourse();
        functional.view.StudentView studentView68 = new functional.view.StudentView(studentEntity63);
        basic.StudentEntity studentEntity74 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long75 = studentEntity74.getCourse();
        java.lang.Long long76 = studentEntity74.getLevel();
        studentView68.setStudentEntity(studentEntity74);
        basic.StudentEntity studentEntity83 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView84 = new functional.view.StudentView(studentEntity83);
        basic.StudentEntity studentEntity85 = studentView84.getStudentEntity();
        java.lang.String str86 = studentEntity85.getRegistration();
        basic.StudentEntity[] studentEntityArray87 = new basic.StudentEntity[]{studentEntity15, studentEntity27, studentEntity52, studentEntity55, studentEntity74, studentEntity85};
        java.util.ArrayList<basic.StudentEntity> studentEntityList88 = new java.util.ArrayList<basic.StudentEntity>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<basic.StudentEntity>) studentEntityList88, studentEntityArray87);
        matriculation8.setStudentAvailable((java.util.List<basic.StudentEntity>) studentEntityList88);
        matriculation0.setStudentAvailable((java.util.List<basic.StudentEntity>) studentEntityList88);
        basic.StudentEntity studentEntity92 = matriculation0.getSelectedStudent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntityList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "" + "'", str64.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-1L) + "'", long67.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 10L + "'", long75.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 1L + "'", long76.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "" + "'", str86.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntityArray87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity92);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long6 = studentEntity5.getCourse();
        java.lang.Long long7 = studentEntity5.getLevel();
        java.lang.String str8 = studentEntity5.getRegistration();
        boolean boolean9 = studentEntity5.validation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        relationship.MatriculateRelationship matriculateRelationship2 = new relationship.MatriculateRelationship((java.lang.Long) 32L, (java.lang.Long) (-1L));
        matriculateRelationship2.setId((long) (short) 1);
        basic.SubjectEntity subjectEntity14 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 0L, (java.lang.Long) 100L, (java.lang.Integer) (-1), (java.lang.Boolean) false, (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.String str15 = subjectEntity14.getName();
        boolean boolean16 = matriculateRelationship2.equals((java.lang.Object) subjectEntity14);
        java.lang.Long long17 = subjectEntity14.getCredit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17.equals(1L));
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship0 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship0.setSubject((java.lang.Long) 0L);
        requirementSubjectRelationship0.setParent((java.lang.Long) 10L);
        requirementSubjectRelationship0.setSubject((java.lang.Long) 100L);
        java.lang.Long long7 = requirementSubjectRelationship0.getParent();
        requirementSubjectRelationship0.setParent((java.lang.Long) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7.equals(10L));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        relationship.filter.RequirementCreditFilter requirementCreditFilter0 = new relationship.filter.RequirementCreditFilter();
        // The following exception was thrown during execution in test generation
        try {
            relationship.RequirementCreditRelationship requirementCreditRelationship2 = requirementCreditFilter0.fromSubject((java.lang.Long) 52L);
            org.junit.Assert.fail("Expected exception of type org.hibernate.service.spi.ServiceException; message: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]");
        } catch (org.hibernate.service.spi.ServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        courseEntity3.setLevel((java.lang.Long) 100L);
        courseEntity3.setLevel((java.lang.Long) 1L);
        java.lang.Long long9 = courseEntity3.getDepartment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9.equals(1L));
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) 10L, "hi!", (java.lang.Long) (-1L));
        relationship.filter.MatriculateFilter matriculateFilter4 = new relationship.filter.MatriculateFilter();
        boolean boolean5 = secretaryEntity3.equals((java.lang.Object) matriculateFilter4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<relationship.MatriculateRelationship> matriculateRelationshipList7 = matriculateFilter4.subjectMatriculateFrom((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type org.hibernate.service.spi.ServiceException; message: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]");
        } catch (org.hibernate.service.spi.ServiceException e) {
            // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship0 = new relationship.RequirementSubjectRelationship();
        basic.StudentEntity studentEntity6 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long7 = studentEntity6.getCourse();
        functional.view.StudentView studentView8 = new functional.view.StudentView(studentEntity6);
        boolean boolean9 = requirementSubjectRelationship0.equals((java.lang.Object) studentView8);
        java.lang.Long long10 = requirementSubjectRelationship0.getSubject();
        requirementSubjectRelationship0.setId((long) '4');
        java.lang.Long long13 = requirementSubjectRelationship0.getSubject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long13);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        functional.Matriculation matriculation0 = new functional.Matriculation();
        java.lang.Boolean boolean1 = matriculation0.doMatriculation();
        basic.SubjectEntity subjectEntity11 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity11.setDescription("");
        subjectEntity11.setWorkload((java.lang.Integer) 100);
        basic.StudentEntity studentEntity21 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView22 = new functional.view.StudentView(studentEntity21);
        basic.StudentEntity studentEntity23 = studentView22.getStudentEntity();
        basic.StudentEntity studentEntity24 = studentView22.getStudentEntity();
        basic.StudentEntity studentEntity25 = studentView22.getStudentEntity();
        boolean boolean26 = subjectEntity11.equals((java.lang.Object) studentEntity25);
        matriculation0.setSelectedStudent(studentEntity25);
        java.lang.Long long28 = studentEntity25.getLevel();
        java.lang.Long long29 = studentEntity25.getCourse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29.equals(10L));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        relationship.ApprovedRelationship approvedRelationship2 = new relationship.ApprovedRelationship((java.lang.Long) 32L, (java.lang.Long) (-1L));
        java.lang.Long long3 = approvedRelationship2.getSubject();
        approvedRelationship2.setSubject((java.lang.Long) 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3.equals((-1L)));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity9.setDescription("");
        boolean boolean12 = subjectEntity9.validation();
        subjectEntity9.setDescription("");
        subjectEntity9.setCourse((java.lang.Long) 0L);
        subjectEntity9.setCredit((java.lang.Long) 1L);
        functional.Matriculation matriculation19 = new functional.Matriculation();
        basic.StudentEntity studentEntity20 = matriculation19.getSelectedStudent();
        java.util.List<basic.StudentEntity> studentEntityList21 = null;
        matriculation19.setStudentAvailable(studentEntityList21);
        java.util.List<basic.SubjectEntity> subjectEntityList23 = matriculation19.getOffer();
        dao.StudentDao studentDao24 = matriculation19.getStudentDao();
        dao.StudentDao studentDao25 = null;
        matriculation19.setStudentDao(studentDao25);
        boolean boolean27 = subjectEntity9.equals((java.lang.Object) studentDao25);
        java.lang.String str28 = subjectEntity9.getCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntityList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) 10L, "hi!", (java.lang.Long) (-1L));
        relationship.filter.MatriculateFilter matriculateFilter4 = new relationship.filter.MatriculateFilter();
        boolean boolean5 = secretaryEntity3.equals((java.lang.Object) matriculateFilter4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<relationship.MatriculateRelationship> matriculateRelationshipList7 = matriculateFilter4.studentMatriculateFrom((java.lang.Long) 32L);
            org.junit.Assert.fail("Expected exception of type org.hibernate.service.spi.ServiceException; message: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]");
        } catch (org.hibernate.service.spi.ServiceException e) {
            // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        boolean boolean5 = courseEntity3.validation();
        courseEntity3.setId((long) (short) 0);
        relationship.MatriculateRelationship matriculateRelationship10 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        long long11 = matriculateRelationship10.getId();
        matriculateRelationship10.setStudent((java.lang.Long) 10L);
        boolean boolean14 = courseEntity3.equals((java.lang.Object) 10L);
        courseEntity3.setDepartment((java.lang.Long) 0L);
        functional.Matriculation matriculation17 = new functional.Matriculation();
        dao.StudentDao studentDao18 = matriculation17.getStudentDao();
        boolean boolean19 = courseEntity3.equals((java.lang.Object) matriculation17);
        dao.StudentDao studentDao20 = matriculation17.getStudentDao();
        java.util.List<basic.SubjectEntity> subjectEntityList21 = matriculation17.getOffer();
        basic.CourseEntity courseEntity25 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long26 = courseEntity25.getId();
        boolean boolean27 = courseEntity25.validation();
        courseEntity25.setId((long) (short) 0);
        relationship.MatriculateRelationship matriculateRelationship32 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        long long33 = matriculateRelationship32.getId();
        matriculateRelationship32.setStudent((java.lang.Long) 10L);
        boolean boolean36 = courseEntity25.equals((java.lang.Object) 10L);
        courseEntity25.setDepartment((java.lang.Long) 0L);
        functional.Matriculation matriculation39 = new functional.Matriculation();
        dao.StudentDao studentDao40 = matriculation39.getStudentDao();
        boolean boolean41 = courseEntity25.equals((java.lang.Object) matriculation39);
        functional.Matriculation matriculation42 = new functional.Matriculation();
        basic.StudentEntity studentEntity43 = matriculation42.getSelectedStudent();
        dao.StudentDao studentDao44 = matriculation42.getStudentDao();
        matriculation39.setStudentDao(studentDao44);
        basic.CourseEntity courseEntity49 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long50 = courseEntity49.getId();
        boolean boolean51 = courseEntity49.validation();
        courseEntity49.setId((long) (short) 0);
        relationship.MatriculateRelationship matriculateRelationship56 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        long long57 = matriculateRelationship56.getId();
        matriculateRelationship56.setStudent((java.lang.Long) 10L);
        boolean boolean60 = courseEntity49.equals((java.lang.Object) 10L);
        courseEntity49.setDepartment((java.lang.Long) 0L);
        functional.Matriculation matriculation63 = new functional.Matriculation();
        dao.StudentDao studentDao64 = matriculation63.getStudentDao();
        boolean boolean65 = courseEntity49.equals((java.lang.Object) matriculation63);
        functional.Matriculation matriculation66 = new functional.Matriculation();
        basic.StudentEntity studentEntity67 = matriculation66.getSelectedStudent();
        dao.StudentDao studentDao68 = matriculation66.getStudentDao();
        matriculation63.setStudentDao(studentDao68);
        matriculation39.setStudentDao(studentDao68);
        dao.StudentDao studentDao71 = matriculation39.getStudentDao();
        matriculation17.setStudentDao(studentDao71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntityList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao71);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship0 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship0.setSubject((java.lang.Long) 0L);
        basic.StudentEntity studentEntity8 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long9 = studentEntity8.getCourse();
        java.lang.Long long10 = studentEntity8.getLevel();
        long long11 = studentEntity8.getId();
        studentEntity8.setCourse((java.lang.Long) (-1L));
        boolean boolean14 = requirementSubjectRelationship0.equals((java.lang.Object) (-1L));
        long long15 = requirementSubjectRelationship0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        boolean boolean5 = courseEntity3.validation();
        courseEntity3.setId((long) (short) 0);
        relationship.MatriculateRelationship matriculateRelationship10 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        long long11 = matriculateRelationship10.getId();
        matriculateRelationship10.setStudent((java.lang.Long) 10L);
        boolean boolean14 = courseEntity3.equals((java.lang.Object) 10L);
        courseEntity3.setDepartment((java.lang.Long) 0L);
        functional.Matriculation matriculation17 = new functional.Matriculation();
        dao.StudentDao studentDao18 = matriculation17.getStudentDao();
        boolean boolean19 = courseEntity3.equals((java.lang.Object) matriculation17);
        functional.Matriculation matriculation20 = new functional.Matriculation();
        basic.StudentEntity studentEntity21 = matriculation20.getSelectedStudent();
        dao.StudentDao studentDao22 = matriculation20.getStudentDao();
        matriculation17.setStudentDao(studentDao22);
        java.util.List<basic.StudentEntity> studentEntityList24 = matriculation17.getStudentAvailable();
        java.util.List<basic.StudentEntity> studentEntityList25 = matriculation17.getStudentAvailable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntityList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntityList25);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        basic.CourseEntity courseEntity0 = new basic.CourseEntity();
        courseEntity0.setLevel((java.lang.Long) 0L);
        long long3 = courseEntity0.getId();
        java.lang.String str4 = courseEntity0.getName();
        courseEntity0.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        basic.SubjectEntity subjectEntity19 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        java.lang.String str20 = subjectEntity19.getDescription();
        boolean boolean21 = subjectEntity19.isNull();
        subjectEntity19.setCode("");
        boolean boolean24 = subjectEntity9.equals((java.lang.Object) subjectEntity19);
        subjectEntity19.setLevel((java.lang.Long) 100L);
        subjectEntity19.setWorkload((java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        java.lang.Long long4 = courseEntity3.getDepartment();
        courseEntity3.setName("");
        courseEntity3.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4.equals(1L));
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        basic.TeacherEntity teacherEntity0 = new basic.TeacherEntity();
        java.lang.String str1 = teacherEntity0.getName();
        teacherEntity0.setName("");
        java.lang.Long long4 = teacherEntity0.getDepartment();
        java.lang.String str5 = teacherEntity0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long6 = studentEntity5.getCourse();
        java.lang.Long long7 = studentEntity5.getLevel();
        long long8 = studentEntity5.getId();
        functional.view.StudentView studentView9 = new functional.view.StudentView(studentEntity5);
        basic.StudentEntity studentEntity15 = new basic.StudentEntity("", "hi!", (java.lang.Long) 1L, (java.lang.Long) 0L, "hi!");
        studentEntity15.setId((-1L));
        studentEntity15.setRegistration("hi!");
        studentView9.setStudentEntity(studentEntity15);
        basic.StudentEntity studentEntity26 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        long long27 = studentEntity26.getId();
        java.lang.String str28 = studentEntity26.getName();
        java.lang.String str29 = studentEntity26.getName();
        studentView9.setStudentEntity(studentEntity26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        basic.SubjectEntity subjectEntity19 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        java.lang.String str20 = subjectEntity19.getDescription();
        boolean boolean21 = subjectEntity19.isNull();
        subjectEntity19.setCode("");
        boolean boolean24 = subjectEntity9.equals((java.lang.Object) subjectEntity19);
        java.lang.Long long25 = subjectEntity19.getResponsibleTeacher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25.equals(10L));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        boolean boolean5 = courseEntity3.validation();
        courseEntity3.setId((long) (short) 0);
        java.lang.String str8 = courseEntity3.getName();
        courseEntity3.setName("hi!");
        java.lang.Long long11 = courseEntity3.getDepartment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11.equals(1L));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        java.lang.Boolean boolean10 = subjectEntity9.getBinding();
        subjectEntity9.setLevel((java.lang.Long) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10.equals(false));
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        relationship.ApprovedRelationship approvedRelationship2 = new relationship.ApprovedRelationship((java.lang.Long) (-1L), (java.lang.Long) 0L);
        java.lang.Long long3 = approvedRelationship2.getStudent();
        approvedRelationship2.setSubject((java.lang.Long) 0L);
        approvedRelationship2.setId((java.lang.Long) 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3.equals((-1L)));
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("", "", (java.lang.Long) (-1L), (java.lang.Long) 100L, "hi!");
        java.lang.Long long6 = studentEntity5.getCourse();
        boolean boolean7 = studentEntity5.validation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        relationship.MatriculateRelationship matriculateRelationship2 = new relationship.MatriculateRelationship((java.lang.Long) 32L, (java.lang.Long) (-1L));
        matriculateRelationship2.setId((long) (short) 1);
        long long5 = matriculateRelationship2.getId();
        matriculateRelationship2.setStudent((java.lang.Long) 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        boolean boolean5 = courseEntity3.validation();
        courseEntity3.setId((long) (short) 0);
        relationship.RequirementSubjectRelationship requirementSubjectRelationship8 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship8.setSubject((java.lang.Long) 0L);
        requirementSubjectRelationship8.setParent((java.lang.Long) 10L);
        requirementSubjectRelationship8.setSubject((java.lang.Long) 100L);
        requirementSubjectRelationship8.setId(10L);
        boolean boolean17 = courseEntity3.equals((java.lang.Object) requirementSubjectRelationship8);
        java.lang.String str18 = courseEntity3.getName();
        courseEntity3.setId((long) (byte) -1);
        long long21 = courseEntity3.getId();
        relationship.RequirementCreditRelationship requirementCreditRelationship24 = new relationship.RequirementCreditRelationship((java.lang.Long) 1L, (java.lang.Long) 10L);
        requirementCreditRelationship24.setId((long) (short) 100);
        long long27 = requirementCreditRelationship24.getId();
        boolean boolean28 = courseEntity3.equals((java.lang.Object) requirementCreditRelationship24);
        long long29 = requirementCreditRelationship24.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        basic.StudentEntity studentEntity0 = new basic.StudentEntity();
        java.lang.Long long1 = studentEntity0.getCourse();
        studentEntity0.setRegistration("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView6 = new functional.view.StudentView(studentEntity5);
        studentEntity5.setId((long) 1);
        functional.view.StudentView studentView9 = new functional.view.StudentView(studentEntity5);
        functional.view.StudentView studentView10 = new functional.view.StudentView(studentEntity5);
        java.lang.String str11 = studentEntity5.getRegistration();
        relationship.RequirementSubjectRelationship requirementSubjectRelationship12 = new relationship.RequirementSubjectRelationship();
        basic.StudentEntity studentEntity18 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long19 = studentEntity18.getCourse();
        functional.view.StudentView studentView20 = new functional.view.StudentView(studentEntity18);
        boolean boolean21 = requirementSubjectRelationship12.equals((java.lang.Object) studentView20);
        java.lang.Long long22 = requirementSubjectRelationship12.getSubject();
        requirementSubjectRelationship12.setId((long) '4');
        boolean boolean25 = studentEntity5.equals((java.lang.Object) requirementSubjectRelationship12);
        requirementSubjectRelationship12.setSubject((java.lang.Long) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList3 = offeredFilter0.fromCourseToStudent((java.lang.Long) 10L, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type org.hibernate.service.spi.ServiceException; message: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]");
        } catch (org.hibernate.service.spi.ServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView6 = new functional.view.StudentView(studentEntity5);
        studentEntity5.setId((long) 1);
        functional.view.StudentView studentView9 = new functional.view.StudentView(studentEntity5);
        functional.view.StudentView studentView10 = new functional.view.StudentView(studentEntity5);
        basic.StudentEntity studentEntity11 = studentView10.getStudentEntity();
        java.lang.String str12 = studentEntity11.getName();
        long long13 = studentEntity11.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        relationship.MatriculateRelationship matriculateRelationship2 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) 1L);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship0 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship0.setSubject((java.lang.Long) 0L);
        requirementSubjectRelationship0.setParent((java.lang.Long) 10L);
        requirementSubjectRelationship0.setSubject((java.lang.Long) 100L);
        java.lang.Long long7 = requirementSubjectRelationship0.getSubject();
        relationship.OfferedRelationship offeredRelationship10 = new relationship.OfferedRelationship((java.lang.Long) 100L, (java.lang.Long) 10L);
        offeredRelationship10.setId(1L);
        offeredRelationship10.setCourse((java.lang.Long) 1L);
        basic.StudentEntity studentEntity20 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long21 = studentEntity20.getCourse();
        functional.view.StudentView studentView22 = new functional.view.StudentView(studentEntity20);
        boolean boolean23 = offeredRelationship10.equals((java.lang.Object) studentView22);
        offeredRelationship10.setSubject((java.lang.Long) 1L);
        offeredRelationship10.setSubject((java.lang.Long) 0L);
        boolean boolean28 = requirementSubjectRelationship0.equals((java.lang.Object) offeredRelationship10);
        relationship.MatriculateRelationship matriculateRelationship31 = new relationship.MatriculateRelationship((java.lang.Long) 1L, (java.lang.Long) 100L);
        long long32 = matriculateRelationship31.getId();
        boolean boolean33 = offeredRelationship10.equals((java.lang.Object) matriculateRelationship31);
        long long34 = matriculateRelationship31.getId();
        java.lang.Long long35 = matriculateRelationship31.getSubject();
        matriculateRelationship31.setSubject((java.lang.Long) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35.equals(100L));
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        java.lang.Long long10 = subjectEntity9.getResponsibleTeacher();
        boolean boolean11 = subjectEntity9.isNull();
        java.lang.Long long12 = subjectEntity9.getLevel();
        java.lang.Long long13 = subjectEntity9.getLevel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13.equals(1L));
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        relationship.filter.ApprovedFilter approvedFilter0 = new relationship.filter.ApprovedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList2 = approvedFilter0.approvalsFromStudent((java.lang.Long) 52L);
            org.junit.Assert.fail("Expected exception of type org.hibernate.service.spi.ServiceException; message: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]");
        } catch (org.hibernate.service.spi.ServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        basic.TeacherEntity teacherEntity0 = new basic.TeacherEntity();
        java.lang.String str1 = teacherEntity0.getName();
        teacherEntity0.setName("");
        long long4 = teacherEntity0.getId();
        teacherEntity0.setDepartment((java.lang.Long) 10L);
        java.lang.Long long7 = teacherEntity0.getDepartment();
        teacherEntity0.setDepartment((java.lang.Long) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7.equals(10L));
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        basic.DepartmentEntity departmentEntity0 = new basic.DepartmentEntity();
        boolean boolean2 = departmentEntity0.equals((java.lang.Object) 1L);
        departmentEntity0.setName("");
        departmentEntity0.setName("hi!");
        departmentEntity0.setId((long) (byte) 0);
        java.lang.String str9 = departmentEntity0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        relationship.OfferedRelationship offeredRelationship2 = new relationship.OfferedRelationship((java.lang.Long) 100L, (java.lang.Long) 10L);
        offeredRelationship2.setId(1L);
        offeredRelationship2.setSubject((java.lang.Long) 0L);
        offeredRelationship2.setId(32L);
        offeredRelationship2.setCourse((java.lang.Long) 1L);
        offeredRelationship2.setSubject((java.lang.Long) 52L);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        relationship.MatriculateRelationship matriculateRelationship2 = new relationship.MatriculateRelationship((java.lang.Long) 32L, (java.lang.Long) 0L);
        relationship.RequirementSubjectRelationship requirementSubjectRelationship3 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship3.setSubject((java.lang.Long) 0L);
        requirementSubjectRelationship3.setParent((java.lang.Long) 10L);
        requirementSubjectRelationship3.setSubject((java.lang.Long) 100L);
        boolean boolean10 = matriculateRelationship2.equals((java.lang.Object) requirementSubjectRelationship3);
        matriculateRelationship2.setStudent((java.lang.Long) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        relationship.ApprovedRelationship approvedRelationship2 = new relationship.ApprovedRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        approvedRelationship2.setId((java.lang.Long) 10L);
        java.lang.Long long5 = approvedRelationship2.getSubject();
        java.lang.Long long6 = approvedRelationship2.getSubject();
        java.lang.Long long7 = approvedRelationship2.getSubject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7.equals(10L));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        basic.DepartmentEntity departmentEntity2 = new basic.DepartmentEntity("", (java.lang.Long) 100L);
        boolean boolean3 = departmentEntity2.validation();
        boolean boolean4 = departmentEntity2.validation();
        departmentEntity2.setName("");
        java.lang.Long long7 = departmentEntity2.getResponsible();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7.equals(100L));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        java.lang.Long long5 = courseEntity3.getDepartment();
        courseEntity3.setLevel((java.lang.Long) (-1L));
        courseEntity3.setDepartment((java.lang.Long) 0L);
        long long10 = courseEntity3.getId();
        boolean boolean11 = courseEntity3.validation();
        courseEntity3.setDepartment((java.lang.Long) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        functional.Matriculation matriculation0 = new functional.Matriculation();
        basic.StudentEntity studentEntity1 = matriculation0.getSelectedStudent();
        java.util.List<basic.StudentEntity> studentEntityList2 = null;
        matriculation0.setStudentAvailable(studentEntityList2);
        java.util.List<basic.SubjectEntity> subjectEntityList4 = matriculation0.getOffer();
        dao.StudentDao studentDao5 = matriculation0.getStudentDao();
        dao.StudentDao studentDao6 = null;
        matriculation0.setStudentDao(studentDao6);
        java.util.List<basic.SubjectEntity> subjectEntityList8 = matriculation0.getSubjects();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntityList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntityList8);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        basic.TeacherEntity teacherEntity0 = new basic.TeacherEntity();
        teacherEntity0.setId((long) 10);
        teacherEntity0.setName("hi!");
        teacherEntity0.setDepartment((java.lang.Long) 10L);
        functional.view.SecretaryView secretaryView7 = new functional.view.SecretaryView();
        basic.SecretaryEntity secretaryEntity11 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity11.setName("");
        secretaryView7.setSecretaryEntity(secretaryEntity11);
        basic.SecretaryEntity secretaryEntity15 = new basic.SecretaryEntity();
        secretaryEntity15.setLevel((java.lang.Long) 10L);
        secretaryView7.setSecretaryEntity(secretaryEntity15);
        basic.SecretaryEntity secretaryEntity19 = secretaryView7.getSecretaryEntity();
        relationship.ApprovedRelationship approvedRelationship22 = new relationship.ApprovedRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        approvedRelationship22.setId((java.lang.Long) 10L);
        boolean boolean25 = secretaryEntity19.equals((java.lang.Object) approvedRelationship22);
        boolean boolean26 = teacherEntity0.equals((java.lang.Object) secretaryEntity19);
        secretaryEntity19.setName("");
        secretaryEntity19.setId((long) 0);
        secretaryEntity19.setLevel((java.lang.Long) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(secretaryEntity19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        functional.Matriculation matriculation0 = new functional.Matriculation();
        basic.StudentEntity studentEntity1 = matriculation0.getSelectedStudent();
        java.util.List<basic.StudentEntity> studentEntityList2 = null;
        matriculation0.setStudentAvailable(studentEntityList2);
        dao.StudentDao studentDao4 = null;
        matriculation0.setStudentDao(studentDao4);
        java.util.List<basic.SubjectEntity> subjectEntityList6 = matriculation0.getSubjects();
        java.util.List<basic.SubjectEntity> subjectEntityList7 = matriculation0.getOffer();
        basic.StudentEntity studentEntity13 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView14 = new functional.view.StudentView(studentEntity13);
        basic.StudentEntity studentEntity15 = studentView14.getStudentEntity();
        java.lang.Long long16 = studentEntity15.getCourse();
        java.lang.String str17 = studentEntity15.getRegistration();
        java.lang.Long long18 = studentEntity15.getCourse();
        matriculation0.setSelectedStudent(studentEntity15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntityList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntityList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18.equals(10L));
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship2 = new relationship.RequirementSubjectRelationship((java.lang.Long) 0L, (java.lang.Long) 1L);
        requirementSubjectRelationship2.setParent((java.lang.Long) 100L);
        long long5 = requirementSubjectRelationship2.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "", (java.lang.Long) 0L, (java.lang.Long) 100L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) 100L, "hi!");
        subjectEntity9.setWorkload((java.lang.Integer) (-1));
        java.lang.String str12 = subjectEntity9.getName();
        boolean boolean13 = subjectEntity9.isNull();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView6 = new functional.view.StudentView(studentEntity5);
        studentEntity5.setCourse((java.lang.Long) 0L);
        studentEntity5.setRegistration("");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        basic.TeacherEntity teacherEntity2 = new basic.TeacherEntity("", (java.lang.Long) 0L);
        basic.SubjectEntity subjectEntity12 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity12.setDescription("");
        subjectEntity12.setWorkload((java.lang.Integer) 100);
        basic.StudentEntity studentEntity22 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView23 = new functional.view.StudentView(studentEntity22);
        basic.StudentEntity studentEntity24 = studentView23.getStudentEntity();
        basic.StudentEntity studentEntity25 = studentView23.getStudentEntity();
        basic.StudentEntity studentEntity26 = studentView23.getStudentEntity();
        boolean boolean27 = subjectEntity12.equals((java.lang.Object) studentEntity26);
        subjectEntity12.setBinding((java.lang.Boolean) true);
        subjectEntity12.setResponsibleTeacher((java.lang.Long) 0L);
        boolean boolean32 = teacherEntity2.equals((java.lang.Object) subjectEntity12);
        java.lang.Long long33 = subjectEntity12.getCredit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33.equals((-1L)));
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView6 = new functional.view.StudentView(studentEntity5);
        basic.StudentEntity studentEntity7 = studentView6.getStudentEntity();
        basic.StudentEntity studentEntity13 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView14 = new functional.view.StudentView(studentEntity13);
        java.lang.Long long15 = studentEntity13.getLevel();
        java.lang.String str16 = studentEntity13.getRegistration();
        studentView6.setStudentEntity(studentEntity13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = studentView6.toString();
            org.junit.Assert.fail("Expected exception of type org.hibernate.service.spi.ServiceException; message: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]");
        } catch (org.hibernate.service.spi.ServiceException e) {
            // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView6 = new functional.view.StudentView(studentEntity5);
        studentEntity5.setCourse((java.lang.Long) 0L);
        functional.view.StudentView studentView9 = new functional.view.StudentView(studentEntity5);
        java.lang.Long long10 = studentEntity5.getLevel();
        studentEntity5.setCourse((java.lang.Long) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10.equals(1L));
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        basic.TeacherEntity teacherEntity0 = new basic.TeacherEntity();
        teacherEntity0.setId((long) 10);
        teacherEntity0.setName("");
        relationship.OfferedRelationship offeredRelationship7 = new relationship.OfferedRelationship((java.lang.Long) 100L, (java.lang.Long) 10L);
        offeredRelationship7.setId(1L);
        offeredRelationship7.setSubject((java.lang.Long) 0L);
        java.lang.Long long12 = offeredRelationship7.getCourse();
        relationship.RequirementCreditRelationship requirementCreditRelationship15 = new relationship.RequirementCreditRelationship((java.lang.Long) 1L, (java.lang.Long) 10L);
        requirementCreditRelationship15.setCredit((java.lang.Long) 1L);
        requirementCreditRelationship15.setSubject((java.lang.Long) 10L);
        java.lang.Long long20 = requirementCreditRelationship15.getSubject();
        requirementCreditRelationship15.setSubject((java.lang.Long) (-1L));
        boolean boolean23 = offeredRelationship7.equals((java.lang.Object) requirementCreditRelationship15);
        boolean boolean24 = teacherEntity0.equals((java.lang.Object) boolean23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship0 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship0.setSubject((java.lang.Long) 0L);
        requirementSubjectRelationship0.setParent((java.lang.Long) 10L);
        requirementSubjectRelationship0.setSubject((java.lang.Long) 100L);
        java.lang.Long long7 = requirementSubjectRelationship0.getParent();
        relationship.MatriculateRelationship matriculateRelationship10 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        long long11 = matriculateRelationship10.getId();
        boolean boolean12 = requirementSubjectRelationship0.equals((java.lang.Object) matriculateRelationship10);
        java.lang.Long long13 = requirementSubjectRelationship0.getParent();
        long long14 = requirementSubjectRelationship0.getId();
        relationship.RequirementSubjectRelationship requirementSubjectRelationship15 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship15.setSubject((java.lang.Long) 0L);
        long long18 = requirementSubjectRelationship15.getId();
        java.lang.Long long19 = requirementSubjectRelationship15.getParent();
        boolean boolean20 = requirementSubjectRelationship0.equals((java.lang.Object) long19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) 10L, "", (java.lang.Long) 0L);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship2 = new relationship.RequirementSubjectRelationship((java.lang.Long) 0L, (java.lang.Long) 100L);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        boolean boolean5 = courseEntity3.validation();
        courseEntity3.setId((long) (short) 0);
        relationship.MatriculateRelationship matriculateRelationship10 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        long long11 = matriculateRelationship10.getId();
        matriculateRelationship10.setStudent((java.lang.Long) 10L);
        boolean boolean14 = courseEntity3.equals((java.lang.Object) 10L);
        courseEntity3.setDepartment((java.lang.Long) 0L);
        functional.Matriculation matriculation17 = new functional.Matriculation();
        dao.StudentDao studentDao18 = matriculation17.getStudentDao();
        boolean boolean19 = courseEntity3.equals((java.lang.Object) matriculation17);
        courseEntity3.setDepartment((java.lang.Long) 32L);
        java.lang.String str22 = courseEntity3.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        relationship.ApprovedRelationship approvedRelationship2 = new relationship.ApprovedRelationship((java.lang.Long) (-1L), (java.lang.Long) 0L);
        java.lang.Long long3 = approvedRelationship2.getStudent();
        approvedRelationship2.setSubject((java.lang.Long) 100L);
        java.lang.Long long6 = approvedRelationship2.getStudent();
        java.lang.Long long7 = approvedRelationship2.getSubject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7.equals(100L));
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        boolean boolean5 = courseEntity3.validation();
        courseEntity3.setId((long) (short) 0);
        relationship.MatriculateRelationship matriculateRelationship10 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        long long11 = matriculateRelationship10.getId();
        matriculateRelationship10.setStudent((java.lang.Long) 10L);
        boolean boolean14 = courseEntity3.equals((java.lang.Object) 10L);
        courseEntity3.setDepartment((java.lang.Long) 0L);
        functional.Matriculation matriculation17 = new functional.Matriculation();
        dao.StudentDao studentDao18 = matriculation17.getStudentDao();
        boolean boolean19 = courseEntity3.equals((java.lang.Object) matriculation17);
        functional.Matriculation matriculation20 = new functional.Matriculation();
        basic.StudentEntity studentEntity21 = matriculation20.getSelectedStudent();
        dao.StudentDao studentDao22 = matriculation20.getStudentDao();
        matriculation17.setStudentDao(studentDao22);
        basic.StudentEntity studentEntity29 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView30 = new functional.view.StudentView(studentEntity29);
        basic.StudentEntity studentEntity31 = studentView30.getStudentEntity();
        java.lang.Long long32 = studentEntity31.getCourse();
        matriculation17.setSelectedStudent(studentEntity31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32.equals(10L));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList3 = offeredFilter0.fromDepartmentToStudent((java.lang.Long) 52L, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type org.hibernate.service.spi.ServiceException; message: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]");
        } catch (org.hibernate.service.spi.ServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        java.lang.Long long5 = courseEntity3.getDepartment();
        courseEntity3.setLevel((java.lang.Long) (-1L));
        courseEntity3.setDepartment((java.lang.Long) 0L);
        java.lang.String str10 = courseEntity3.getName();
        courseEntity3.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        relationship.filter.RequirementSubjectFilter requirementSubjectFilter0 = new relationship.filter.RequirementSubjectFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<relationship.RequirementSubjectRelationship> requirementSubjectRelationshipList2 = requirementSubjectFilter0.fromSubject((java.lang.Long) 52L);
            org.junit.Assert.fail("Expected exception of type org.hibernate.service.spi.ServiceException; message: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]");
        } catch (org.hibernate.service.spi.ServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.String str6 = studentEntity5.getRegistration();
        studentEntity5.setCourse((java.lang.Long) (-1L));
        java.lang.Long long9 = studentEntity5.getCourse();
        functional.view.StudentView studentView10 = new functional.view.StudentView(studentEntity5);
        basic.StudentEntity studentEntity16 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView17 = new functional.view.StudentView(studentEntity16);
        studentEntity16.setId((long) (short) 0);
        studentView10.setStudentEntity(studentEntity16);
        studentEntity16.setCourse((java.lang.Long) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9.equals((-1L)));
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        relationship.RequirementCreditRelationship requirementCreditRelationship2 = new relationship.RequirementCreditRelationship((java.lang.Long) 1L, (java.lang.Long) 10L);
        requirementCreditRelationship2.setId((long) (short) 100);
        long long5 = requirementCreditRelationship2.getId();
        requirementCreditRelationship2.setId(1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity9.setDescription("");
        boolean boolean12 = subjectEntity9.validation();
        subjectEntity9.setDescription("");
        subjectEntity9.setCourse((java.lang.Long) 0L);
        java.lang.String str17 = subjectEntity9.getName();
        subjectEntity9.setLevel((java.lang.Long) 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        basic.SubjectEntity subjectEntity0 = new basic.SubjectEntity();
        java.lang.Boolean boolean1 = subjectEntity0.getBinding();
        subjectEntity0.setCredit((java.lang.Long) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        relationship.filter.RequirementCreditFilter requirementCreditFilter0 = new relationship.filter.RequirementCreditFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = requirementCreditFilter0.canEnroll((java.lang.Long) 0L, (java.lang.Long) 32L);
            org.junit.Assert.fail("Expected exception of type org.hibernate.service.spi.ServiceException; message: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]");
        } catch (org.hibernate.service.spi.ServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        basic.CourseEntity courseEntity0 = new basic.CourseEntity();
        courseEntity0.setLevel((java.lang.Long) 0L);
        java.lang.Long long3 = courseEntity0.getDepartment();
        java.lang.String str4 = courseEntity0.getName();
        courseEntity0.setId((long) 'a');
        courseEntity0.setLevel((java.lang.Long) 1L);
        relationship.RequirementCreditRelationship requirementCreditRelationship11 = new relationship.RequirementCreditRelationship((java.lang.Long) 1L, (java.lang.Long) 10L);
        requirementCreditRelationship11.setCredit((java.lang.Long) 1L);
        requirementCreditRelationship11.setSubject((java.lang.Long) 10L);
        java.lang.Long long16 = requirementCreditRelationship11.getCredit();
        java.lang.Long long17 = requirementCreditRelationship11.getCredit();
        requirementCreditRelationship11.setCredit((java.lang.Long) 10L);
        boolean boolean20 = courseEntity0.equals((java.lang.Object) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        functional.Matriculation matriculation0 = new functional.Matriculation();
        basic.StudentEntity studentEntity1 = matriculation0.getSelectedStudent();
        java.util.List<basic.StudentEntity> studentEntityList2 = null;
        matriculation0.setStudentAvailable(studentEntityList2);
        java.lang.Boolean boolean4 = matriculation0.doMatriculation();
        java.util.List<basic.SubjectEntity> subjectEntityList5 = matriculation0.getSubjects();
        dao.StudentDao studentDao6 = matriculation0.getStudentDao();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntityList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao6);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        basic.SubjectEntity subjectEntity0 = new basic.SubjectEntity();
        java.lang.Long long1 = subjectEntity0.getResponsibleTeacher();
        subjectEntity0.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        java.lang.Long long10 = subjectEntity9.getResponsibleTeacher();
        java.lang.String str11 = subjectEntity9.getCode();
        java.lang.Long long12 = subjectEntity9.getLevel();
        subjectEntity9.setResponsibleTeacher((java.lang.Long) 52L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12.equals(1L));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "", (java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Integer) 0, (java.lang.Boolean) true, (java.lang.Long) 1L, (java.lang.Long) 100L, "");
        subjectEntity9.setBinding((java.lang.Boolean) true);
        java.lang.Long long12 = subjectEntity9.getResponsibleTeacher();
        boolean boolean13 = subjectEntity9.validation();
        subjectEntity9.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity3.setName("");
        java.lang.Long long6 = secretaryEntity3.getLevel();
        java.lang.Long long7 = secretaryEntity3.getLevel();
        secretaryEntity3.setId((long) (short) 10);
        boolean boolean10 = secretaryEntity3.validation();
        java.lang.Long long11 = secretaryEntity3.getDepartment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11.equals(0L));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity9.setDescription("");
        boolean boolean12 = subjectEntity9.validation();
        subjectEntity9.setCourse((java.lang.Long) 1L);
        subjectEntity9.setName("hi!");
        subjectEntity9.setLevel((java.lang.Long) 1L);
        boolean boolean19 = subjectEntity9.isNull();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        boolean boolean5 = courseEntity3.validation();
        courseEntity3.setId((long) (short) 0);
        relationship.MatriculateRelationship matriculateRelationship10 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        long long11 = matriculateRelationship10.getId();
        matriculateRelationship10.setStudent((java.lang.Long) 10L);
        boolean boolean14 = courseEntity3.equals((java.lang.Object) 10L);
        courseEntity3.setDepartment((java.lang.Long) 0L);
        functional.Matriculation matriculation17 = new functional.Matriculation();
        dao.StudentDao studentDao18 = matriculation17.getStudentDao();
        boolean boolean19 = courseEntity3.equals((java.lang.Object) matriculation17);
        basic.CourseEntity courseEntity23 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long24 = courseEntity23.getId();
        boolean boolean25 = courseEntity23.validation();
        courseEntity23.setId((long) (short) 0);
        relationship.MatriculateRelationship matriculateRelationship30 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        long long31 = matriculateRelationship30.getId();
        matriculateRelationship30.setStudent((java.lang.Long) 10L);
        boolean boolean34 = courseEntity23.equals((java.lang.Object) 10L);
        courseEntity23.setDepartment((java.lang.Long) 0L);
        functional.Matriculation matriculation37 = new functional.Matriculation();
        dao.StudentDao studentDao38 = matriculation37.getStudentDao();
        boolean boolean39 = courseEntity23.equals((java.lang.Object) matriculation37);
        functional.Matriculation matriculation40 = new functional.Matriculation();
        basic.StudentEntity studentEntity41 = matriculation40.getSelectedStudent();
        dao.StudentDao studentDao42 = matriculation40.getStudentDao();
        matriculation37.setStudentDao(studentDao42);
        dao.StudentDao studentDao44 = matriculation37.getStudentDao();
        matriculation17.setStudentDao(studentDao44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao44);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long6 = studentEntity5.getCourse();
        java.lang.Long long7 = studentEntity5.getLevel();
        long long8 = studentEntity5.getId();
        functional.view.StudentView studentView9 = new functional.view.StudentView(studentEntity5);
        java.lang.String str10 = studentEntity5.getRegistration();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 0L, "");
        basic.TeacherEntity teacherEntity6 = new basic.TeacherEntity();
        java.lang.String str7 = teacherEntity6.getName();
        java.lang.String str8 = teacherEntity6.getName();
        teacherEntity6.setDepartment((java.lang.Long) 0L);
        basic.StudentEntity studentEntity16 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView17 = new functional.view.StudentView(studentEntity16);
        java.lang.Long long18 = studentEntity16.getLevel();
        java.lang.Class<?> wildcardClass19 = studentEntity16.getClass();
        boolean boolean20 = teacherEntity6.equals((java.lang.Object) studentEntity16);
        teacherEntity6.setId(100L);
        boolean boolean23 = studentEntity5.equals((java.lang.Object) teacherEntity6);
        basic.DepartmentEntity departmentEntity26 = new basic.DepartmentEntity("", (java.lang.Long) 100L);
        boolean boolean27 = departmentEntity26.validation();
        java.lang.String str28 = departmentEntity26.getName();
        boolean boolean29 = departmentEntity26.validation();
        departmentEntity26.setId(32L);
        basic.StudentEntity studentEntity37 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        functional.view.StudentView studentView38 = new functional.view.StudentView(studentEntity37);
        basic.StudentEntity studentEntity39 = studentView38.getStudentEntity();
        basic.StudentEntity studentEntity40 = studentView38.getStudentEntity();
        basic.StudentEntity studentEntity41 = studentView38.getStudentEntity();
        basic.StudentEntity studentEntity47 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long48 = studentEntity47.getCourse();
        functional.view.StudentView studentView49 = new functional.view.StudentView(studentEntity47);
        studentView38.setStudentEntity(studentEntity47);
        boolean boolean51 = departmentEntity26.equals((java.lang.Object) studentView38);
        boolean boolean52 = studentEntity5.equals((java.lang.Object) boolean51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentEntity41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 10L + "'", long48.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        basic.SubjectEntity subjectEntity0 = new basic.SubjectEntity();
        subjectEntity0.setCredit((java.lang.Long) 100L);
        subjectEntity0.setLevel((java.lang.Long) 1L);
        java.lang.Long long5 = subjectEntity0.getCredit();
        long long6 = subjectEntity0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        boolean boolean5 = courseEntity3.validation();
        courseEntity3.setId((long) (short) 0);
        relationship.MatriculateRelationship matriculateRelationship10 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        long long11 = matriculateRelationship10.getId();
        matriculateRelationship10.setStudent((java.lang.Long) 10L);
        boolean boolean14 = courseEntity3.equals((java.lang.Object) 10L);
        courseEntity3.setDepartment((java.lang.Long) 0L);
        functional.Matriculation matriculation17 = new functional.Matriculation();
        dao.StudentDao studentDao18 = matriculation17.getStudentDao();
        boolean boolean19 = courseEntity3.equals((java.lang.Object) matriculation17);
        functional.Matriculation matriculation20 = new functional.Matriculation();
        basic.StudentEntity studentEntity21 = matriculation20.getSelectedStudent();
        dao.StudentDao studentDao22 = matriculation20.getStudentDao();
        matriculation17.setStudentDao(studentDao22);
        basic.CourseEntity courseEntity27 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long28 = courseEntity27.getId();
        boolean boolean29 = courseEntity27.validation();
        courseEntity27.setId((long) (short) 0);
        relationship.MatriculateRelationship matriculateRelationship34 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        long long35 = matriculateRelationship34.getId();
        matriculateRelationship34.setStudent((java.lang.Long) 10L);
        boolean boolean38 = courseEntity27.equals((java.lang.Object) 10L);
        courseEntity27.setDepartment((java.lang.Long) 0L);
        functional.Matriculation matriculation41 = new functional.Matriculation();
        dao.StudentDao studentDao42 = matriculation41.getStudentDao();
        boolean boolean43 = courseEntity27.equals((java.lang.Object) matriculation41);
        functional.Matriculation matriculation44 = new functional.Matriculation();
        basic.StudentEntity studentEntity45 = matriculation44.getSelectedStudent();
        dao.StudentDao studentDao46 = matriculation44.getStudentDao();
        matriculation41.setStudentDao(studentDao46);
        matriculation17.setStudentDao(studentDao46);
        dao.StudentDao studentDao49 = matriculation17.getStudentDao();
        basic.CourseEntity courseEntity53 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long54 = courseEntity53.getId();
        boolean boolean55 = courseEntity53.validation();
        courseEntity53.setId((long) (short) 0);
        relationship.MatriculateRelationship matriculateRelationship60 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        long long61 = matriculateRelationship60.getId();
        matriculateRelationship60.setStudent((java.lang.Long) 10L);
        boolean boolean64 = courseEntity53.equals((java.lang.Object) 10L);
        courseEntity53.setDepartment((java.lang.Long) 0L);
        functional.Matriculation matriculation67 = new functional.Matriculation();
        dao.StudentDao studentDao68 = matriculation67.getStudentDao();
        boolean boolean69 = courseEntity53.equals((java.lang.Object) matriculation67);
        functional.Matriculation matriculation70 = new functional.Matriculation();
        basic.StudentEntity studentEntity71 = matriculation70.getSelectedStudent();
        dao.StudentDao studentDao72 = matriculation70.getStudentDao();
        matriculation67.setStudentDao(studentDao72);
        basic.CourseEntity courseEntity77 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long78 = courseEntity77.getId();
        boolean boolean79 = courseEntity77.validation();
        courseEntity77.setId((long) (short) 0);
        relationship.MatriculateRelationship matriculateRelationship84 = new relationship.MatriculateRelationship((java.lang.Long) (-1L), (java.lang.Long) 10L);
        long long85 = matriculateRelationship84.getId();
        matriculateRelationship84.setStudent((java.lang.Long) 10L);
        boolean boolean88 = courseEntity77.equals((java.lang.Object) 10L);
        courseEntity77.setDepartment((java.lang.Long) 0L);
        functional.Matriculation matriculation91 = new functional.Matriculation();
        dao.StudentDao studentDao92 = matriculation91.getStudentDao();
        boolean boolean93 = courseEntity77.equals((java.lang.Object) matriculation91);
        functional.Matriculation matriculation94 = new functional.Matriculation();
        basic.StudentEntity studentEntity95 = matriculation94.getSelectedStudent();
        dao.StudentDao studentDao96 = matriculation94.getStudentDao();
        matriculation91.setStudentDao(studentDao96);
        matriculation67.setStudentDao(studentDao96);
        matriculation17.setStudentDao(studentDao96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity95);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao96);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        basic.TeacherEntity teacherEntity0 = new basic.TeacherEntity();
        teacherEntity0.setId((long) 10);
        basic.CourseEntity courseEntity6 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long7 = courseEntity6.getId();
        boolean boolean8 = courseEntity6.validation();
        courseEntity6.setId((long) (short) 0);
        relationship.RequirementSubjectRelationship requirementSubjectRelationship11 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship11.setSubject((java.lang.Long) 0L);
        requirementSubjectRelationship11.setParent((java.lang.Long) 10L);
        requirementSubjectRelationship11.setSubject((java.lang.Long) 100L);
        requirementSubjectRelationship11.setId(10L);
        boolean boolean20 = courseEntity6.equals((java.lang.Object) requirementSubjectRelationship11);
        long long21 = requirementSubjectRelationship11.getId();
        boolean boolean22 = teacherEntity0.equals((java.lang.Object) requirementSubjectRelationship11);
        java.lang.Long long23 = requirementSubjectRelationship11.getParent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23.equals(10L));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        functional.view.SecretaryView secretaryView0 = new functional.view.SecretaryView();
        basic.SecretaryEntity secretaryEntity4 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity4.setName("");
        secretaryView0.setSecretaryEntity(secretaryEntity4);
        basic.SecretaryEntity secretaryEntity8 = new basic.SecretaryEntity();
        secretaryEntity8.setLevel((java.lang.Long) 10L);
        secretaryView0.setSecretaryEntity(secretaryEntity8);
        java.lang.String str12 = secretaryView0.toString();
        basic.SecretaryEntity secretaryEntity16 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity16.setName("");
        secretaryEntity16.setName("");
        secretaryView0.setSecretaryEntity(secretaryEntity16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = secretaryView0.toString();
            org.junit.Assert.fail("Expected exception of type org.hibernate.service.spi.ServiceException; message: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]");
        } catch (org.hibernate.service.spi.ServiceException e) {
            // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        basic.TeacherEntity teacherEntity2 = new basic.TeacherEntity("", (java.lang.Long) 0L);
        functional.view.SecretaryView secretaryView3 = new functional.view.SecretaryView();
        basic.SecretaryEntity secretaryEntity4 = null;
        secretaryView3.setSecretaryEntity(secretaryEntity4);
        java.lang.String str6 = secretaryView3.toString();
        basic.SecretaryEntity secretaryEntity7 = secretaryView3.getSecretaryEntity();
        java.lang.String str8 = secretaryView3.toString();
        basic.SecretaryEntity secretaryEntity9 = secretaryView3.getSecretaryEntity();
        java.lang.String str10 = secretaryView3.toString();
        boolean boolean11 = teacherEntity2.equals((java.lang.Object) secretaryView3);
        java.lang.Long long12 = teacherEntity2.getDepartment();
        teacherEntity2.setDepartment((java.lang.Long) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(secretaryEntity7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(secretaryEntity9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12.equals(0L));
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "", (java.lang.Long) 10L, (java.lang.Long) (-1L), (java.lang.Integer) (-1), (java.lang.Boolean) false, (java.lang.Long) (-1L), (java.lang.Long) 0L, "hi!");
        subjectEntity9.setCourse((java.lang.Long) 0L);
        subjectEntity9.setName("");
        subjectEntity9.setId((long) (byte) -1);
        java.lang.Long long16 = subjectEntity9.getResponsibleTeacher();
        basic.SubjectEntity subjectEntity26 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity26.setDescription("");
        java.lang.Boolean boolean29 = subjectEntity26.getBinding();
        subjectEntity26.setCourse((java.lang.Long) (-1L));
        subjectEntity26.setLevel((java.lang.Long) 100L);
        boolean boolean34 = subjectEntity9.equals((java.lang.Object) subjectEntity26);
        java.lang.String str35 = subjectEntity26.getCode();
        subjectEntity26.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        relationship.RequirementSubjectRelationship requirementSubjectRelationship0 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship0.setSubject((java.lang.Long) 0L);
        requirementSubjectRelationship0.setParent((java.lang.Long) 10L);
        requirementSubjectRelationship0.setSubject((java.lang.Long) 100L);
        java.lang.Long long7 = requirementSubjectRelationship0.getSubject();
        relationship.OfferedRelationship offeredRelationship10 = new relationship.OfferedRelationship((java.lang.Long) 100L, (java.lang.Long) 10L);
        offeredRelationship10.setId(1L);
        offeredRelationship10.setCourse((java.lang.Long) 1L);
        basic.StudentEntity studentEntity20 = new basic.StudentEntity("hi!", "", (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        java.lang.Long long21 = studentEntity20.getCourse();
        functional.view.StudentView studentView22 = new functional.view.StudentView(studentEntity20);
        boolean boolean23 = offeredRelationship10.equals((java.lang.Object) studentView22);
        offeredRelationship10.setSubject((java.lang.Long) 1L);
        offeredRelationship10.setSubject((java.lang.Long) 0L);
        boolean boolean28 = requirementSubjectRelationship0.equals((java.lang.Object) offeredRelationship10);
        relationship.MatriculateRelationship matriculateRelationship31 = new relationship.MatriculateRelationship((java.lang.Long) 1L, (java.lang.Long) 100L);
        long long32 = matriculateRelationship31.getId();
        boolean boolean33 = offeredRelationship10.equals((java.lang.Object) matriculateRelationship31);
        java.lang.Long long34 = matriculateRelationship31.getStudent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34.equals(1L));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        relationship.RequirementCreditRelationship requirementCreditRelationship2 = new relationship.RequirementCreditRelationship((java.lang.Long) 1L, (java.lang.Long) 10L);
        requirementCreditRelationship2.setCredit((java.lang.Long) 1L);
        requirementCreditRelationship2.setSubject((java.lang.Long) 10L);
        java.lang.Long long7 = requirementCreditRelationship2.getSubject();
        java.lang.Long long8 = requirementCreditRelationship2.getCredit();
        requirementCreditRelationship2.setCredit((java.lang.Long) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8.equals(1L));
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity9.setDescription("");
        java.lang.Boolean boolean12 = subjectEntity9.getBinding();
        subjectEntity9.setCourse((java.lang.Long) (-1L));
        subjectEntity9.setBinding((java.lang.Boolean) true);
        subjectEntity9.setName("hi!");
        java.lang.String str19 = subjectEntity9.getName();
        long long20 = subjectEntity9.getId();
        subjectEntity9.setBinding((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        relationship.filter.OfferedFilter offeredFilter0 = new relationship.filter.OfferedFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<basic.SubjectEntity> subjectEntityList3 = offeredFilter0.fromCourseToStudent((java.lang.Long) 100L, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type org.hibernate.service.spi.ServiceException; message: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]");
        } catch (org.hibernate.service.spi.ServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        java.lang.Long long10 = subjectEntity9.getResponsibleTeacher();
        java.lang.String str11 = subjectEntity9.getCode();
        java.lang.Long long12 = subjectEntity9.getLevel();
        java.lang.String str13 = subjectEntity9.getDescription();
        boolean boolean14 = subjectEntity9.validation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        relationship.ApprovedRelationship approvedRelationship2 = new relationship.ApprovedRelationship((java.lang.Long) 1L, (java.lang.Long) 0L);
        functional.view.SubjectView subjectView3 = new functional.view.SubjectView();
        basic.SubjectEntity subjectEntity4 = subjectView3.getSubjectEntity();
        boolean boolean5 = approvedRelationship2.equals((java.lang.Object) subjectView3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntity4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity9.setDescription("");
        boolean boolean12 = subjectEntity9.validation();
        subjectEntity9.setWorkload((java.lang.Integer) 100);
        subjectEntity9.setWorkload((java.lang.Integer) (-1));
        boolean boolean17 = subjectEntity9.isNull();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        boolean boolean5 = courseEntity3.validation();
        courseEntity3.setId((long) (short) 0);
        relationship.RequirementSubjectRelationship requirementSubjectRelationship8 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship8.setSubject((java.lang.Long) 0L);
        requirementSubjectRelationship8.setParent((java.lang.Long) 10L);
        requirementSubjectRelationship8.setSubject((java.lang.Long) 100L);
        requirementSubjectRelationship8.setId(10L);
        boolean boolean17 = courseEntity3.equals((java.lang.Object) requirementSubjectRelationship8);
        java.lang.String str18 = courseEntity3.getName();
        courseEntity3.setId((long) (byte) -1);
        courseEntity3.setLevel((java.lang.Long) 10L);
        long long23 = courseEntity3.getId();
        boolean boolean24 = courseEntity3.validation();
        courseEntity3.setLevel((java.lang.Long) 52L);
        java.lang.Long long27 = courseEntity3.getDepartment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27.equals(1L));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        basic.StudentEntity studentEntity5 = new basic.StudentEntity("", "hi!", (java.lang.Long) 1L, (java.lang.Long) 0L, "hi!");
        studentEntity5.setId((-1L));
        studentEntity5.setRegistration("hi!");
        java.lang.String str10 = studentEntity5.getName();
        studentEntity5.setCourse((java.lang.Long) 1L);
        studentEntity5.setRegistration("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        relationship.filter.RequirementCreditFilter requirementCreditFilter0 = new relationship.filter.RequirementCreditFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = requirementCreditFilter0.toMasterSubject((java.lang.Long) 52L);
            org.junit.Assert.fail("Expected exception of type org.hibernate.service.spi.ServiceException; message: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]");
        } catch (org.hibernate.service.spi.ServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        relationship.filter.RequirementCreditFilter requirementCreditFilter0 = new relationship.filter.RequirementCreditFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = requirementCreditFilter0.canEnroll((java.lang.Long) 32L, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type org.hibernate.service.spi.ServiceException; message: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]");
        } catch (org.hibernate.service.spi.ServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        functional.Matriculation matriculation0 = new functional.Matriculation();
        basic.StudentEntity studentEntity1 = matriculation0.getSelectedStudent();
        basic.StudentEntity studentEntity2 = new basic.StudentEntity();
        matriculation0.setSelectedStudent(studentEntity2);
        java.util.List<basic.SubjectEntity> subjectEntityList4 = matriculation0.getSubjects();
        java.lang.Boolean boolean5 = matriculation0.doMatriculation();
        functional.Matriculation matriculation6 = new functional.Matriculation();
        dao.StudentDao studentDao7 = matriculation6.getStudentDao();
        matriculation0.setStudentDao(studentDao7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntityList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentDao7);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        basic.SubjectEntity subjectEntity9 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Integer) 1, (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Long) (-1L), "hi!");
        subjectEntity9.setDescription("");
        boolean boolean12 = subjectEntity9.validation();
        subjectEntity9.setWorkload((java.lang.Integer) 100);
        subjectEntity9.setResponsibleTeacher((java.lang.Long) 100L);
        subjectEntity9.setId((long) (short) 10);
        subjectEntity9.setResponsibleTeacher((java.lang.Long) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        functional.view.SubjectView subjectView0 = new functional.view.SubjectView();
        java.lang.String str1 = subjectView0.toString();
        java.lang.String str2 = subjectView0.toString();
        java.lang.String str3 = subjectView0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        basic.TeacherEntity teacherEntity2 = new basic.TeacherEntity("", (java.lang.Long) (-1L));
        functional.Matriculation matriculation3 = new functional.Matriculation();
        basic.StudentEntity studentEntity4 = matriculation3.getSelectedStudent();
        java.util.List<basic.StudentEntity> studentEntityList5 = null;
        matriculation3.setStudentAvailable(studentEntityList5);
        dao.StudentDao studentDao7 = null;
        matriculation3.setStudentDao(studentDao7);
        basic.StudentEntity studentEntity9 = matriculation3.getSelectedStudent();
        boolean boolean10 = teacherEntity2.equals((java.lang.Object) matriculation3);
        basic.SubjectEntity subjectEntity20 = new basic.SubjectEntity("", "hi!", (java.lang.Long) 0L, (java.lang.Long) 100L, (java.lang.Integer) (-1), (java.lang.Boolean) false, (java.lang.Long) 10L, (java.lang.Long) 1L, "hi!");
        boolean boolean21 = subjectEntity20.isNull();
        boolean boolean22 = teacherEntity2.equals((java.lang.Object) boolean21);
        java.lang.Long long23 = teacherEntity2.getDepartment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(studentEntity9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23.equals((-1L)));
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        courseEntity3.setId((long) (byte) 100);
        java.lang.Long long7 = courseEntity3.getLevel();
        courseEntity3.setName("hi!");
        java.lang.String str10 = courseEntity3.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        basic.SubjectEntity subjectEntity0 = new basic.SubjectEntity();
        java.lang.String str1 = subjectEntity0.getDescription();
        subjectEntity0.setDescription("");
        subjectEntity0.setCredit((java.lang.Long) 100L);
        java.lang.Boolean boolean6 = subjectEntity0.getBinding();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        basic.DepartmentEntity departmentEntity2 = new basic.DepartmentEntity("", (java.lang.Long) 100L);
        boolean boolean3 = departmentEntity2.validation();
        java.lang.String str4 = departmentEntity2.getName();
        departmentEntity2.setId((long) 0);
        java.lang.Long long7 = departmentEntity2.getResponsible();
        long long8 = departmentEntity2.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        functional.view.SubjectView subjectView0 = new functional.view.SubjectView();
        basic.SubjectEntity subjectEntity1 = subjectView0.getSubjectEntity();
        basic.SubjectEntity subjectEntity2 = new basic.SubjectEntity();
        subjectView0.setSubjectEntity(subjectEntity2);
        basic.SubjectEntity subjectEntity4 = subjectView0.getSubjectEntity();
        basic.TeacherEntity teacherEntity5 = new basic.TeacherEntity();
        java.lang.String str6 = teacherEntity5.getName();
        java.lang.Long long7 = teacherEntity5.getDepartment();
        boolean boolean8 = subjectEntity4.equals((java.lang.Object) teacherEntity5);
        java.lang.Long long9 = subjectEntity4.getLevel();
        java.lang.Long long10 = subjectEntity4.getLevel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntity1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(subjectEntity4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        basic.SecretaryEntity secretaryEntity3 = new basic.SecretaryEntity((java.lang.Long) 0L, "", (java.lang.Long) 0L);
        secretaryEntity3.setLevel((java.lang.Long) 0L);
        secretaryEntity3.setName("hi!");
        java.lang.String str8 = secretaryEntity3.getName();
        java.lang.Long long9 = secretaryEntity3.getLevel();
        java.lang.Long long10 = secretaryEntity3.getLevel();
        boolean boolean11 = secretaryEntity3.validation();
        java.lang.Long long12 = secretaryEntity3.getDepartment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12.equals(0L));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        java.lang.Long long5 = courseEntity3.getDepartment();
        courseEntity3.setLevel((java.lang.Long) (-1L));
        courseEntity3.setDepartment((java.lang.Long) 0L);
        long long10 = courseEntity3.getId();
        boolean boolean11 = courseEntity3.validation();
        courseEntity3.setId(1L);
        java.lang.String str14 = courseEntity3.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        relationship.MatriculateRelationship matriculateRelationship2 = new relationship.MatriculateRelationship((java.lang.Long) 32L, (java.lang.Long) 0L);
        relationship.RequirementSubjectRelationship requirementSubjectRelationship3 = new relationship.RequirementSubjectRelationship();
        requirementSubjectRelationship3.setSubject((java.lang.Long) 0L);
        requirementSubjectRelationship3.setParent((java.lang.Long) 10L);
        requirementSubjectRelationship3.setSubject((java.lang.Long) 100L);
        boolean boolean10 = matriculateRelationship2.equals((java.lang.Object) requirementSubjectRelationship3);
        requirementSubjectRelationship3.setParent((java.lang.Long) 32L);
        relationship.RequirementSubjectRelationship requirementSubjectRelationship15 = new relationship.RequirementSubjectRelationship((java.lang.Long) 100L, (java.lang.Long) 32L);
        boolean boolean16 = requirementSubjectRelationship3.equals((java.lang.Object) 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        basic.CourseEntity courseEntity3 = new basic.CourseEntity("", (java.lang.Long) 0L, (java.lang.Long) 1L);
        long long4 = courseEntity3.getId();
        java.lang.Long long5 = courseEntity3.getDepartment();
        courseEntity3.setLevel((java.lang.Long) (-1L));
        courseEntity3.setDepartment((java.lang.Long) 0L);
        long long10 = courseEntity3.getId();
        boolean boolean11 = courseEntity3.validation();
        courseEntity3.setId(1L);
        courseEntity3.setLevel((java.lang.Long) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        functional.view.SubjectView subjectView0 = new functional.view.SubjectView();
        basic.SubjectEntity subjectEntity1 = subjectView0.getSubjectEntity();
        basic.SubjectEntity subjectEntity2 = subjectView0.getSubjectEntity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntity1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(subjectEntity2);
    }
}

