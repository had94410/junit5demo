
import static org.junit.gen5.api.Assertions.*;

import org.junit.gen5.api.Test;

public class Junit5Test {

    @Test
    public void true�ł��邱�Ƃ̌���() {
        assertTrue(false);
    }

    @Test
    public void true�ł��邱�Ƃ̌���_�����_�����n����() {
        assertTrue(() -> false);
    }

    @Test
    public void true�ł��邱�Ƃ̌���_�����ɔC�ӂ̃��b�Z�[�W���Z�b�g�ł���() {
        assertTrue(false, "true �����҂����̂� false ������");
    }

    @Test
    public void true�ł��邱�Ƃ̌���_�����ɔC�ӂ̃��b�Z�[�W�������_���ŃZ�b�g�ł���() {
        assertTrue(false, () -> "true �����҂����̂� false ������");
    }

    @Test
    public void false�ł��邱�Ƃ̌���() {
        assertFalse(true);
    }

    @Test
    public void equals�Ŕ�r���ē������Ƃ�����() {
        assertEquals("hoge", "fuga");
    }

    @Test
    public void equals�Ŕ�r���ĈقȂ邱�Ƃ�����() {
        assertNotEquals("hoge", "hoge");
    }

    @Test
    public void null�łȂ����Ƃ�����() {
        assertNotNull(null);
    }

    @Test
    public void null�ł��邱�Ƃ�����() {
        assertNull("not null");
    }

    @Test
    public void �����Ŕ�r���ē����C���X�^���X�ł��邱�Ƃ�����() {
        assertSame(new String("hoge"), new String("hoge"));
    }

    @Test
    public void �w�肵����O���X���[����邱�Ƃ�����() {
        assertThrows(IllegalArgumentException.class, () -> {throw new NullPointerException();});
    }

    @Test
    public void �X���[���ꂽ��O�����؂���������_���̗�O���擾����() {
        IllegalArgumentException e = expectThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("�e�X�g�ł�");
        });

        assertEquals("test �ł�", e.getMessage());
    }

    @Test
    public void �����̃A�T�[�V�������܂Ƃ߂Ď��s() {
        assertAll(
            () -> assertTrue(false, "true �ƐM���Ă��� false ������"),
            () -> assertEquals("hoge", "fuga", "hoge �ƐM���Ă�")
        );
    }
}