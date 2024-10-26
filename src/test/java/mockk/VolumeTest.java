package mockk;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class VolumeTest {
    
    @Mock
    private AudioManager audioManager; // 1 - Crie um mock da classe AudioManager

    @InjectMocks
    private VolumeUtil volumeUtil; // 2 - Injete um mock da classe VolumeUtil

    @Test
    public void testAudioManagerSetVolume() {
        int maxVolume = 100; 

        // 3 - Realize uma chamada para o método maximizeVolume do objeto VolumeUtil
        volumeUtil.maximizeVolume(maxVolume);

        // 4 - Verifique se o método setVolume foi chamado uma única vez
        verify(audioManager, times(1)).setVolume(maxVolume);
    }


}
