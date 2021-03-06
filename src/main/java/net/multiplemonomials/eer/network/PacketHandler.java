package net.multiplemonomials.eer.network;

import net.multiplemonomials.eer.network.message.*;
import net.multiplemonomials.eer.reference.Reference;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

public class PacketHandler
{
    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MOD_ID.toLowerCase());

    public static void init()
    {
        INSTANCE.registerMessage(MessageTileEntityEE.class, MessageTileEntityEE.class, 0, Side.CLIENT);
        INSTANCE.registerMessage(MessageTileCalcinator.class, MessageTileCalcinator.class, 1, Side.CLIENT);
        INSTANCE.registerMessage(MessageTileEntityAludel.class, MessageTileEntityAludel.class, 2, Side.CLIENT);
        INSTANCE.registerMessage(MessageTileEntityGlassBell.class, MessageTileEntityGlassBell.class, 3, Side.CLIENT);
        INSTANCE.registerMessage(MessageKeyPressed.class, MessageKeyPressed.class, 4, Side.SERVER);
        INSTANCE.registerMessage(MessageEERExtendedPlayerUpdateClient.class, MessageEERExtendedPlayerUpdateClient.class, 5, Side.CLIENT);
        INSTANCE.registerMessage(MessageEERExtendedPlayerUpdateServer.class, MessageEERExtendedPlayerUpdateServer.class, 6, Side.SERVER);
        INSTANCE.registerMessage(MessageTileAlchemicalChest.class, MessageTileAlchemicalChest.class, 7, Side.CLIENT);
        INSTANCE.registerMessage(MessageTileCondenser.class, MessageTileCondenser.class, 8, Side.CLIENT);
        INSTANCE.registerMessage(MessageTileEnergyCollector.class, MessageTileEnergyCollector.class, 9, Side.CLIENT);
        INSTANCE.registerMessage(MessageEnergyCollectorUpdate.class, MessageEnergyCollectorUpdate.class, 10, Side.CLIENT);
        
    }
}
