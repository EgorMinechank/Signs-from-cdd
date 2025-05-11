package net.em.sfc.block.custom;

import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class SignBlock extends Block {
    public static final DirectionProperty FACING = Properties.FACING;

    private static final VoxelShape UP_SHAPE = createCuboidShapeVoxel(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
    private static final VoxelShape DOWN_SHAPE = createCuboidShapeVoxel(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
    private static final VoxelShape NORTH_SHAPE = createCuboidShapeVoxel(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
    private static final VoxelShape WEST_SHAPE = createCuboidShapeVoxel(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
    private static final VoxelShape EAST_SHAPE = createCuboidShapeVoxel(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    private static final VoxelShape SOUTH_SHAPE = createCuboidShapeVoxel(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);

    public SignBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.UP));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case DOWN -> DOWN_SHAPE;
            case UP -> UP_SHAPE;
            case NORTH -> NORTH_SHAPE;
            case SOUTH -> SOUTH_SHAPE;
            case WEST -> WEST_SHAPE;
            case EAST -> EAST_SHAPE;
        };
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getSide());
    }

    // Изменено имя метода, чтобы избежать конфликта
    private static VoxelShape createCuboidShapeVoxel(double minX, double minY, double minZ,
                                                     double maxX, double maxY, double maxZ) {
        return VoxelShapes.cuboid(minX/16, minY/16, minZ/16, maxX/16, maxY/16, maxZ/16);
    }
}