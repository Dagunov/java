package monopoly;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.Spy;

import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MonopolyMockitoIT {
    @Mock
    private Player player;
    private Monopoly game = new Monopoly();

    @Test
    public void GetInfoAboutGame_ReturnsPlayers_Success() {
        game.setPlayers(List.of(player));
        when(player.getName()).thenReturn("Nazar");
        when(player.getChanceCards()).thenReturn(List.of(new ChanceCard()));
        when(player.getPropertyCards()).thenReturn(List.of(new PropertyCard()));
        Assert.assertEquals(List.of(player), game.getInfoAboutGame());
    }

    @Spy
    private final PropertyCard spy_card;

    @Spy
    private final Player spy_player;

    @Test
    public void GetProperty_Create_EqualOwner(){
        spy_player = new Player("Vova");
        spy_card = spy_player.getProperty();

        Assert.assertEquals(spy_card.getOwner(), spy_player.getProperty().getOwner());
    }
}