---
navigation:
  title: "Redstone Contraptions"
  icon: "minecraft:observer"
  position: 5
  parent: lexicon:redstone.md
---

# Redstone Contraptions

The following pages contain blueprints for useful redstone contraptions. 


-  You can find even more redstone contraptions in the [Farming Chapter](../farming.md).

-----

## Streetlamp

<GameScene interactive={true} zoom={2}>
  <Block x="1" y="0" z="1" id="minecraft:spruce_fence" />
  <Block x="1" y="1" z="1" id="minecraft:stone_brick_wall"p:up="true" />
  <Block x="1" y="2" z="0" id="minecraft:stone_brick_stairs"p:facing="east" p:half="bottom" />
  <Block x="0" y="2" z="1" id="minecraft:stone_brick_stairs"p:facing="south" p:half="bottom" />
  <Block x="1" y="2" z="1" id="minecraft:daylight_detector"p:inverted="true" />
  <Block x="2" y="2" z="1" id="minecraft:stone_brick_stairs"p:facing="north" p:half="bottom" />
  <Block x="1" y="2" z="2" id="minecraft:stone_brick_stairs"p:facing="west" p:half="bottom" />
  <Block x="1" y="3" z="0" id="minecraft:spruce_fence"p:east="true" />
  <Block x="0" y="3" z="1" id="minecraft:spruce_fence"p:south="true" />
  <Block x="1" y="3" z="1" id="minecraft:redstone_lamp"p:lit="false" />
  <Block x="2" y="3" z="1" id="minecraft:spruce_fence"p:north="true" />
  <Block x="1" y="3" z="2" id="minecraft:spruce_fence"p:west="true" />
  <Block x="1" y="4" z="1" id="minecraft:hopper" />
  <Block x="1" y="5" z="1" id="minecraft:spruce_fence" />
  <Block x="1" y="6" z="1" id="minecraft:spruce_fence" />
  <Block x="1" y="7" z="1" id="minecraft:stone_brick_wall"p:up="true" />
  <Block x="1" y="8" z="0" id="minecraft:spruce_trapdoor"p:open="true" p:half="bottom" p:facing="west" />
  <Block x="0" y="8" z="1" id="minecraft:spruce_trapdoor"p:open="true" p:half="bottom" p:facing="north" />
  <Block x="1" y="8" z="1" id="minecraft:chiseled_stone_bricks" />
  <Block x="2" y="8" z="1" id="minecraft:spruce_trapdoor"p:open="true" p:half="bottom" p:facing="south" />
  <Block x="1" y="8" z="2" id="minecraft:spruce_trapdoor"p:open="true" p:half="bottom" p:facing="east" />
</GameScene>

This is a streetlamp that turns itself on at night.

-----

## Armor Equipper

<GameScene interactive={true} zoom={2}>
  <Block x="2" y="0" z="0" id="minecraft:stone_bricks" />
  <Block x="3" y="0" z="0" id="minecraft:oak_slab" />
  <Block x="2" y="0" z="1" id="minecraft:stone_bricks" />
  <Block x="3" y="0" z="1" id="minecraft:spruce_trapdoor" />
  <Block x="1" y="0" z="2" id="minecraft:redstone_wire"p:east="none" p:north="side" p:south="side" p:west="none" p:power="0" />
  <Block x="2" y="0" z="2" id="minecraft:stone_bricks" />
  <Block x="3" y="0" z="2" id="minecraft:spruce_trapdoor" />
  <Block x="2" y="0" z="3" id="minecraft:stone_bricks" />
  <Block x="3" y="0" z="3" id="minecraft:spruce_trapdoor" />
  <Block x="2" y="0" z="4" id="minecraft:stone_bricks" />
  <Block x="3" y="0" z="4" id="minecraft:oak_slab" />
  <Block x="2" y="1" z="0" id="minecraft:stone_bricks" />
  <Block x="3" y="1" z="0" id="minecraft:oak_log" />
  <Block x="2" y="1" z="1" id="minecraft:dispenser"p:facing="east" />
  <Block x="3" y="1" z="1" id="minecraft:spruce_door"p:facing="south" p:half="upper" p:hinge="right" />
  <Block x="0" y="1" z="2" id="minecraft:redstone_wire"p:east="side" p:north="none" p:south="up" p:west="side" p:power="0" />
  <Block x="1" y="1" z="2" id="minecraft:dispenser"p:facing="south" />
  <Block x="2" y="1" z="3" id="minecraft:dispenser"p:facing="west" />
  <Block x="3" y="1" z="3" id="minecraft:spruce_door"p:facing="south" p:half="upper" p:hinge="left" />
  <Block x="2" y="1" z="4" id="minecraft:stone_bricks" />
  <Block x="3" y="1" z="4" id="minecraft:oak_log" />
  <Block x="2" y="2" z="0" id="minecraft:stone_bricks" />
  <Block x="3" y="2" z="0" id="minecraft:oak_log" />
  <Block x="0" y="2" z="1" id="minecraft:redstone_wire"p:east="side" p:north="none" p:south="side" p:west="none" p:power="0" />
  <Block x="1" y="2" z="1" id="minecraft:repeater"p:facing="north" />
  <Block x="2" y="2" z="1" id="minecraft:dispenser"p:facing="east" />
  <Block x="3" y="2" z="1" id="minecraft:spruce_door"p:facing="south" p:half="lower" p:hinge="right" />
  <Block x="0" y="2" z="2" id="minecraft:smooth_stone_slab"p:type="top" />
  <Block x="1" y="2" z="2" id="minecraft:dispenser"p:facing="south" />
  <Block x="2" y="2" z="2" id="minecraft:stone_pressure_plate" />
  <Block x="0" y="2" z="3" id="minecraft:redstone_wire"p:east="none" p:north="none" p:south="side" p:west="side" p:power="0" />
  <Block x="1" y="2" z="3" id="minecraft:repeater"p:facing="north" />
  <Block x="2" y="2" z="3" id="minecraft:dispenser"p:facing="west" />
  <Block x="3" y="2" z="3" id="minecraft:spruce_door"p:facing="south" p:half="lower" p:hinge="left" />
  <Block x="2" y="2" z="4" id="minecraft:stone_bricks" />
  <Block x="3" y="2" z="4" id="minecraft:oak_log" />
  <Block x="2" y="3" z="0" id="minecraft:stone_bricks" />
  <Block x="3" y="3" z="0" id="minecraft:stone_bricks" />
  <Block x="0" y="3" z="1" id="minecraft:stone_bricks" />
  <Block x="1" y="3" z="1" id="minecraft:stone_bricks" />
  <Block x="2" y="3" z="1" id="minecraft:stone_bricks" />
  <Block x="3" y="3" z="1" id="minecraft:stone_bricks" />
  <Block x="0" y="3" z="2" id="minecraft:redstone_wire"p:east="up" p:north="none" p:south="side" p:west="up" p:power="0" />
  <Block x="1" y="3" z="2" id="minecraft:redstone_wire"p:east="none" p:north="side" p:south="side" p:west="none" p:power="0" />
  <Block x="2" y="3" z="2" id="minecraft:dispenser"p:facing="up" />
  <Block x="3" y="3" z="2" id="minecraft:stone_bricks" />
  <Block x="0" y="3" z="3" id="minecraft:stone_bricks" />
  <Block x="1" y="3" z="3" id="minecraft:stone_bricks" />
  <Block x="2" y="3" z="3" id="minecraft:stone_bricks" />
  <Block x="3" y="3" z="3" id="minecraft:stone_bricks" />
  <Block x="2" y="3" z="4" id="minecraft:stone_bricks" />
  <Block x="3" y="3" z="4" id="minecraft:stone_bricks" />
</GameScene>

This contraption equips you with armor & tools that you previously placed in the [*Dispenser*](./redstone_components.md#dispenser) when entering the [*Pressure Plate*](./redstone_components.md#pressure_plate) 
(one [*Dispenser*](./redstone_components.md#dispenser) per item type)

-----

## Refilling Respawn Anchor

<GameScene interactive={true} zoom={2}>
  <Block x="0" y="0" z="1" id="minecraft:observer"p:facing="east" />
  <Block x="0" y="0" z="2" id="minecraft:respawn_anchor" />
  <Block x="0" y="1" z="0" id="minecraft:dispenser"p:facing="west" />
  <Block x="0" y="1" z="1" id="minecraft:observer"p:facing="west" />
  <Block x="0" y="1" z="2" id="minecraft:dispenser"p:facing="up" />
</GameScene>

This contraption will add *Glowstone* whenever you die from the [*Dispenser*](./redstone_components.md#dispenser) below to the [*Respawn Anchor*](../useables/respawn_anchor.md) and refills it.

-----

## 2-Way 2x2 Piston Door

<GameScene interactive={true} zoom={2}>
  <Block x="0" y="0" z="4" id="minecraft:stone_bricks" />
  <Block x="1" y="0" z="4" id="minecraft:stone_bricks" />
  <Block x="2" y="0" z="4" id="minecraft:stone_bricks" />
  <Block x="3" y="0" z="4" id="minecraft:stone_bricks" />
  <Block x="4" y="0" z="4" id="minecraft:stone_bricks" />
  <Block x="0" y="0" z="5" id="minecraft:stone_bricks" />
  <Block x="1" y="0" z="5" id="minecraft:stone_bricks" />
  <Block x="2" y="0" z="5" id="minecraft:stone_bricks" />
  <Block x="3" y="0" z="5" id="minecraft:stone_bricks" />
  <Block x="4" y="0" z="5" id="minecraft:stone_bricks" />
  <Block x="2" y="1" z="1" id="minecraft:redstone_wire"p:east="side" p:north="none" p:south="none" p:west="side" p:power="0" />
  <Block x="2" y="1" z="2" id="minecraft:sticky_piston"p:facing="east" />
  <Block x="0" y="1" z="3" id="minecraft:stone_bricks" />
  <Block x="1" y="1" z="3" id="minecraft:stone_bricks" />
  <Block x="2" y="1" z="3" id="minecraft:stone_bricks" />
  <Block x="3" y="1" z="3" id="minecraft:stone_bricks" />
  <Block x="4" y="1" z="3" id="minecraft:stone_bricks" />
  <Block x="0" y="1" z="5" id="minecraft:lever"p:facing="west" p:face="wall" />
  <Block x="4" y="1" z="5" id="minecraft:lever"p:facing="west" p:face="wall" />
  <Block x="0" y="1" z="6" id="minecraft:stone_bricks" />
  <Block x="1" y="1" z="6" id="minecraft:stone_bricks" />
  <Block x="2" y="1" z="6" id="minecraft:stone_bricks" />
  <Block x="3" y="1" z="6" id="minecraft:stone_bricks" />
  <Block x="4" y="1" z="6" id="minecraft:stone_bricks" />
  <Block x="0" y="1" z="7" id="minecraft:note_block" />
  <Block x="2" y="1" z="7" id="minecraft:sticky_piston"p:facing="west" />
  <Block x="4" y="1" z="7" id="minecraft:note_block" />
  <Block x="2" y="1" z="8" id="minecraft:redstone_wire"p:east="side" p:north="none" p:south="none" p:west="side" p:power="0" />
  <Block x="2" y="2" z="0" id="minecraft:redstone_wire"p:east="up" p:north="none" p:south="side" p:west="none" p:power="0" />
  <Block x="2" y="2" z="1" id="minecraft:white_wool" />
  <Block x="2" y="2" z="2" id="minecraft:sticky_piston"p:facing="east" />
  <Block x="0" y="2" z="3" id="minecraft:stone_bricks" />
  <Block x="1" y="2" z="3" id="minecraft:stone_bricks" />
  <Block x="2" y="2" z="3" id="minecraft:stone_bricks" />
  <Block x="3" y="2" z="3" id="minecraft:stone_bricks" />
  <Block x="4" y="2" z="3" id="minecraft:stone_bricks" />
  <Block x="0" y="2" z="6" id="minecraft:stone_bricks" />
  <Block x="1" y="2" z="6" id="minecraft:stone_bricks" />
  <Block x="2" y="2" z="6" id="minecraft:stone_bricks" />
  <Block x="3" y="2" z="6" id="minecraft:stone_bricks" />
  <Block x="4" y="2" z="6" id="minecraft:stone_bricks" />
  <Block x="0" y="2" z="7" id="minecraft:observer"p:facing="up" />
  <Block x="2" y="2" z="7" id="minecraft:sticky_piston"p:facing="west" />
  <Block x="4" y="2" z="7" id="minecraft:observer"p:facing="up" />
  <Block x="2" y="2" z="8" id="minecraft:white_wool" />
  <Block x="2" y="2" z="9" id="minecraft:redstone_wire"p:east="none" p:north="none" p:south="side" p:west="up" p:power="0" />
  <Block x="2" y="3" z="0" id="minecraft:white_wool" />
  <Block x="3" y="3" z="0" id="minecraft:redstone_wire"p:east="side" p:north="up" p:south="none" p:west="none" p:power="0" />
  <Block x="0" y="3" z="4" id="minecraft:stone_bricks" />
  <Block x="1" y="3" z="4" id="minecraft:stone_bricks" />
  <Block x="2" y="3" z="4" id="minecraft:stone_bricks" />
  <Block x="3" y="3" z="4" id="minecraft:stone_bricks" />
  <Block x="4" y="3" z="4" id="minecraft:stone_bricks" />
  <Block x="0" y="3" z="5" id="minecraft:stone_bricks" />
  <Block x="1" y="3" z="5" id="minecraft:stone_bricks" />
  <Block x="2" y="3" z="5" id="minecraft:stone_bricks" />
  <Block x="3" y="3" z="5" id="minecraft:stone_bricks" />
  <Block x="4" y="3" z="5" id="minecraft:stone_bricks" />
  <Block x="0" y="3" z="7" id="minecraft:redstone_wire"p:east="none" p:north="side" p:south="side" p:west="none" p:power="0" />
  <Block x="1" y="3" z="7" id="minecraft:redstone_wire"p:east="none" p:north="side" p:south="side" p:west="none" p:power="0" />
  <Block x="2" y="3" z="7" id="minecraft:redstone_wire"p:east="none" p:north="side" p:south="side" p:west="none" p:power="0" />
  <Block x="3" y="3" z="7" id="minecraft:redstone_wire"p:east="side" p:north="side" p:south="side" p:west="side" p:power="0" />
  <Block x="4" y="3" z="7" id="minecraft:redstone_wire"p:east="none" p:north="side" p:south="side" p:west="none" p:power="0" />
  <Block x="3" y="3" z="8" id="minecraft:redstone_wire"p:east="side" p:north="none" p:south="none" p:west="side" p:power="0" />
  <Block x="2" y="3" z="9" id="minecraft:white_wool" />
  <Block x="3" y="3" z="9" id="minecraft:redstone_wire"p:east="none" p:north="up" p:south="none" p:west="side" p:power="0" />
  <Block x="3" y="4" z="0" id="minecraft:white_wool" />
  <Block x="3" y="4" z="1" id="minecraft:redstone_wire"p:east="side" p:north="none" p:south="none" p:west="up" p:power="0" />
  <Block x="3" y="4" z="2" id="minecraft:redstone_wire"p:east="side" p:north="none" p:south="none" p:west="side" p:power="0" />
  <Block x="3" y="4" z="3" id="minecraft:redstone_wire"p:east="side" p:north="none" p:south="none" p:west="side" p:power="0" />
  <Block x="3" y="4" z="4" id="minecraft:redstone_wire"p:east="side" p:north="none" p:south="none" p:west="side" p:power="0" />
  <Block x="3" y="4" z="5" id="minecraft:redstone_wire"p:east="side" p:north="none" p:south="none" p:west="side" p:power="0" />
  <Block x="3" y="4" z="6" id="minecraft:redstone_wire"p:east="up" p:north="none" p:south="none" p:west="side" p:power="0" />
  <Block x="0" y="4" z="7" id="minecraft:white_wool" />
  <Block x="1" y="4" z="7" id="minecraft:white_wool" />
  <Block x="2" y="4" z="7" id="minecraft:white_wool" />
  <Block x="3" y="4" z="7" id="minecraft:white_wool" />
  <Block x="4" y="4" z="7" id="minecraft:white_wool" />
  <Block x="3" y="4" z="8" id="minecraft:white_wool" />
  <Block x="3" y="4" z="9" id="minecraft:white_wool" />
  <Block x="3" y="5" z="1" id="minecraft:white_wool" />
  <Block x="3" y="5" z="2" id="minecraft:white_wool" />
  <Block x="3" y="5" z="3" id="minecraft:white_wool" />
  <Block x="3" y="5" z="4" id="minecraft:white_wool" />
  <Block x="3" y="5" z="5" id="minecraft:white_wool" />
  <Block x="3" y="5" z="6" id="minecraft:white_wool" />
</GameScene>

This is a relative simple 2x2 [*Piston*](./redstone_components.md#piston) door that works from 2 sides.

-----

## 2-Way 3x3 Piston Door

<GameScene interactive={true} zoom={2}>
  <Block x="3" y="0" z="1" id="minecraft:redstone_wire"p:east="side" p:north="side" p:south="none" p:west="none" p:power="0" />
  <Block x="3" y="0" z="2" id="minecraft:redstone_wire"p:east="side" p:north="none" p:south="none" p:west="side" p:power="0" />
  <Block x="3" y="0" z="3" id="minecraft:sticky_piston"p:facing="down" />
  <Block x="3" y="0" z="4" id="minecraft:redstone_wire"p:east="side" p:north="none" p:south="none" p:west="side" p:power="0" />
  <Block x="3" y="0" z="5" id="minecraft:redstone_wire"p:east="none" p:north="side" p:south="none" p:west="side" p:power="0" />
  <Block x="2" y="1" z="1" id="minecraft:redstone_wire"p:east="none" p:north="none" p:south="up" p:west="side" p:power="0" />
  <Block x="3" y="1" z="1" id="minecraft:white_wool" />
  <Block x="0" y="1" z="2" id="minecraft:stone_bricks" />
  <Block x="1" y="1" z="2" id="minecraft:stone_bricks" />
  <Block x="2" y="1" z="2" id="minecraft:stone_bricks" />
  <Block x="3" y="1" z="2" id="minecraft:stone_bricks" />
  <Block x="4" y="1" z="2" id="minecraft:stone_bricks" />
  <Block x="5" y="1" z="2" id="minecraft:stone_bricks" />
  <Block x="0" y="1" z="3" id="minecraft:stone_bricks" />
  <Block x="1" y="1" z="3" id="minecraft:stone_bricks" />
  <Block x="2" y="1" z="3" id="minecraft:stone_bricks" />
  <Block x="3" y="1" z="3" id="minecraft:stone_bricks" />
  <Block x="4" y="1" z="3" id="minecraft:stone_bricks" />
  <Block x="5" y="1" z="3" id="minecraft:stone_bricks" />
  <Block x="0" y="1" z="4" id="minecraft:stone_bricks" />
  <Block x="1" y="1" z="4" id="minecraft:stone_bricks" />
  <Block x="2" y="1" z="4" id="minecraft:stone_bricks" />
  <Block x="3" y="1" z="4" id="minecraft:stone_bricks" />
  <Block x="4" y="1" z="4" id="minecraft:stone_bricks" />
  <Block x="5" y="1" z="4" id="minecraft:stone_bricks" />
  <Block x="2" y="1" z="5" id="minecraft:redstone_wire"p:east="side" p:north="none" p:south="up" p:west="none" p:power="0" />
  <Block x="3" y="1" z="5" id="minecraft:white_wool" />
  <Block x="2" y="2" z="0" id="minecraft:redstone_wire"p:east="up" p:north="none" p:south="none" p:west="side" p:power="0" />
  <Block x="3" y="2" z="0" id="minecraft:sticky_piston"p:facing="east" />
  <Block x="0" y="2" z="1" id="minecraft:stone_bricks" />
  <Block x="1" y="2" z="1" id="minecraft:stone_bricks" />
  <Block x="2" y="2" z="1" id="minecraft:stone_bricks" />
  <Block x="3" y="2" z="1" id="minecraft:stone_bricks" />
  <Block x="4" y="2" z="1" id="minecraft:stone_bricks" />
  <Block x="5" y="2" z="1" id="minecraft:stone_bricks" />
  <Block x="0" y="2" z="5" id="minecraft:stone_bricks" />
  <Block x="1" y="2" z="5" id="minecraft:stone_bricks" />
  <Block x="2" y="2" z="5" id="minecraft:stone_bricks" />
  <Block x="3" y="2" z="5" id="minecraft:stone_bricks" />
  <Block x="4" y="2" z="5" id="minecraft:stone_bricks" />
  <Block x="5" y="2" z="5" id="minecraft:stone_bricks" />
  <Block x="2" y="2" z="6" id="minecraft:redstone_wire"p:east="side" p:north="none" p:south="none" p:west="up" p:power="0" />
  <Block x="3" y="2" z="6" id="minecraft:sticky_piston"p:facing="west" />
  <Block x="2" y="3" z="0" id="minecraft:white_wool" />
  <Block x="3" y="3" z="0" id="minecraft:sticky_piston"p:facing="east" />
  <Block x="0" y="3" z="1" id="minecraft:stone_bricks" />
  <Block x="1" y="3" z="1" id="minecraft:stone_bricks" />
  <Block x="2" y="3" z="1" id="minecraft:stone_bricks" />
  <Block x="3" y="3" z="1" id="minecraft:stone_bricks" />
  <Block x="4" y="3" z="1" id="minecraft:stone_bricks" />
  <Block x="5" y="3" z="1" id="minecraft:stone_bricks" />
  <Block x="0" y="3" z="4" id="minecraft:lever"p:facing="west" p:face="wall" />
  <Block x="5" y="3" z="4" id="minecraft:lever"p:facing="west" p:face="wall" />
  <Block x="0" y="3" z="5" id="minecraft:stone_bricks" />
  <Block x="1" y="3" z="5" id="minecraft:stone_bricks" />
  <Block x="2" y="3" z="5" id="minecraft:stone_bricks" />
  <Block x="3" y="3" z="5" id="minecraft:stone_bricks" />
  <Block x="4" y="3" z="5" id="minecraft:stone_bricks" />
  <Block x="5" y="3" z="5" id="minecraft:stone_bricks" />
  <Block x="0" y="3" z="6" id="minecraft:note_block" />
  <Block x="2" y="3" z="6" id="minecraft:white_wool" />
  <Block x="3" y="3" z="6" id="minecraft:sticky_piston"p:facing="west" />
  <Block x="5" y="3" z="6" id="minecraft:note_block" />
  <Block x="2" y="4" z="0" id="minecraft:observer"p:facing="down" />
  <Block x="3" y="4" z="0" id="minecraft:sticky_piston"p:facing="east" />
  <Block x="0" y="4" z="1" id="minecraft:stone_bricks" />
  <Block x="1" y="4" z="1" id="minecraft:stone_bricks" />
  <Block x="2" y="4" z="1" id="minecraft:stone_bricks" />
  <Block x="3" y="4" z="1" id="minecraft:stone_bricks" />
  <Block x="4" y="4" z="1" id="minecraft:stone_bricks" />
  <Block x="5" y="4" z="1" id="minecraft:stone_bricks" />
  <Block x="0" y="4" z="5" id="minecraft:stone_bricks" />
  <Block x="1" y="4" z="5" id="minecraft:stone_bricks" />
  <Block x="2" y="4" z="5" id="minecraft:stone_bricks" />
  <Block x="3" y="4" z="5" id="minecraft:stone_bricks" />
  <Block x="4" y="4" z="5" id="minecraft:stone_bricks" />
  <Block x="5" y="4" z="5" id="minecraft:stone_bricks" />
  <Block x="0" y="4" z="6" id="minecraft:observer"p:facing="up" />
  <Block x="2" y="4" z="6" id="minecraft:observer"p:facing="down" />
  <Block x="3" y="4" z="6" id="minecraft:sticky_piston"p:facing="west" />
  <Block x="5" y="4" z="6" id="minecraft:observer"p:facing="up" />
  <Block x="2" y="5" z="0" id="minecraft:note_block" />
  <Block x="3" y="5" z="1" id="minecraft:sticky_piston"p:facing="east" />
  <Block x="0" y="5" z="2" id="minecraft:stone_bricks" />
  <Block x="1" y="5" z="2" id="minecraft:stone_bricks" />
  <Block x="2" y="5" z="2" id="minecraft:stone_bricks" />
  <Block x="3" y="5" z="2" id="minecraft:stone_bricks" />
  <Block x="4" y="5" z="2" id="minecraft:stone_bricks" />
  <Block x="5" y="5" z="2" id="minecraft:stone_bricks" />
  <Block x="0" y="5" z="3" id="minecraft:stone_bricks" />
  <Block x="1" y="5" z="3" id="minecraft:stone_bricks" />
  <Block x="2" y="5" z="3" id="minecraft:stone_bricks" />
  <Block x="3" y="5" z="3" id="minecraft:stone_bricks" />
  <Block x="4" y="5" z="3" id="minecraft:stone_bricks" />
  <Block x="5" y="5" z="3" id="minecraft:stone_bricks" />
  <Block x="0" y="5" z="4" id="minecraft:stone_bricks" />
  <Block x="1" y="5" z="4" id="minecraft:stone_bricks" />
  <Block x="2" y="5" z="4" id="minecraft:stone_bricks" />
  <Block x="3" y="5" z="4" id="minecraft:stone_bricks" />
  <Block x="4" y="5" z="4" id="minecraft:stone_bricks" />
  <Block x="5" y="5" z="4" id="minecraft:stone_bricks" />
  <Block x="0" y="5" z="6" id="minecraft:redstone_wire"p:east="side" p:north="none" p:south="none" p:west="side" p:power="0" />
  <Block x="2" y="5" z="6" id="minecraft:note_block" />
  <Block x="5" y="5" z="6" id="minecraft:redstone_wire"p:east="side" p:north="none" p:south="none" p:west="side" p:power="0" />
  <Block x="2" y="6" z="0" id="minecraft:white_wool" />
  <Block x="3" y="6" z="0" id="minecraft:redstone_wire"p:east="side" p:north="side" p:south="side" p:west="side" p:power="0" />
  <Block x="2" y="6" z="1" id="minecraft:observer"p:facing="east" />
  <Block x="3" y="6" z="1" id="minecraft:white_wool" />
  <Block x="2" y="6" z="2" id="minecraft:observer"p:facing="east" />
  <Block x="3" y="6" z="2" id="minecraft:observer"p:facing="down" />
  <Block x="0" y="6" z="3" id="minecraft:redstone_wire"p:east="side" p:north="none" p:south="side" p:west="none" p:power="0" />
  <Block x="1" y="6" z="3" id="minecraft:redstone_wire"p:east="none" p:north="side" p:south="side" p:west="none" p:power="0" />
  <Block x="2" y="6" z="3" id="minecraft:observer"p:facing="north" />
  <Block x="3" y="6" z="3" id="minecraft:sticky_piston"p:facing="up" />
  <Block x="0" y="6" z="4" id="minecraft:redstone_wire"p:east="side" p:north="none" p:south="none" p:west="side" p:power="0" />
  <Block x="2" y="6" z="4" id="minecraft:observer"p:facing="west" />
  <Block x="3" y="6" z="4" id="minecraft:observer"p:facing="east" />
  <Block x="0" y="6" z="5" id="minecraft:redstone_wire"p:east="up" p:north="none" p:south="none" p:west="side" p:power="0" />
  <Block x="2" y="6" z="5" id="minecraft:observer"p:facing="west" />
  <Block x="3" y="6" z="5" id="minecraft:observer"p:facing="down" />
  <Block x="0" y="6" z="6" id="minecraft:white_wool" />
  <Block x="2" y="6" z="6" id="minecraft:white_wool" />
  <Block x="5" y="6" z="6" id="minecraft:white_wool" />
  <Block x="0" y="6" z="7" id="minecraft:redstone_wire"p:east="side" p:north="none" p:south="none" p:west="up" p:power="0" />
  <Block x="5" y="6" z="7" id="minecraft:redstone_wire"p:east="side" p:north="none" p:south="none" p:west="up" p:power="0" />
  <Block x="0" y="6" z="8" id="minecraft:redstone_wire"p:east="none" p:north="none" p:south="side" p:west="side" p:power="0" />
  <Block x="1" y="6" z="8" id="minecraft:redstone_wire"p:east="none" p:north="side" p:south="side" p:west="none" p:power="0" />
  <Block x="2" y="6" z="8" id="minecraft:redstone_wire"p:east="none" p:north="side" p:south="side" p:west="none" p:power="0" />
  <Block x="3" y="6" z="8" id="minecraft:redstone_wire"p:east="none" p:north="side" p:south="side" p:west="none" p:power="0" />
  <Block x="4" y="6" z="8" id="minecraft:redstone_wire"p:east="none" p:north="side" p:south="side" p:west="none" p:power="0" />
  <Block x="5" y="6" z="8" id="minecraft:redstone_wire"p:east="none" p:north="side" p:south="none" p:west="side" p:power="0" />
  <Block x="3" y="7" z="0" id="minecraft:redstone_lamp" />
  <Block x="2" y="7" z="1" id="minecraft:observer"p:facing="up" />
  <Block x="3" y="7" z="1" id="minecraft:observer"p:facing="west" />
  <Block x="2" y="7" z="2" id="minecraft:observer"p:facing="west" />
  <Block x="3" y="7" z="2" id="minecraft:note_block" />
  <Block x="0" y="7" z="3" id="minecraft:white_wool" />
  <Block x="1" y="7" z="3" id="minecraft:white_wool" />
  <Block x="2" y="7" z="3" id="minecraft:observer"p:facing="west" />
  <Block x="3" y="7" z="3" id="minecraft:sticky_piston"p:facing="up" />
  <Block x="0" y="7" z="4" id="minecraft:white_wool" />
  <Block x="2" y="7" z="4" id="minecraft:white_wool" />
  <Block x="0" y="7" z="5" id="minecraft:white_wool" />
  <Block x="2" y="7" z="5" id="minecraft:piston"p:facing="south" />
  <Block x="0" y="7" z="6" id="minecraft:white_wool" />
  <Block x="0" y="7" z="7" id="minecraft:white_wool" />
  <Block x="5" y="7" z="7" id="minecraft:white_wool" />
  <Block x="0" y="7" z="8" id="minecraft:white_wool" />
  <Block x="1" y="7" z="8" id="minecraft:white_wool" />
  <Block x="2" y="7" z="8" id="minecraft:white_wool" />
  <Block x="3" y="7" z="8" id="minecraft:white_wool" />
  <Block x="4" y="7" z="8" id="minecraft:white_wool" />
  <Block x="5" y="7" z="8" id="minecraft:white_wool" />
</GameScene>

This is a fast complex 3x3 [*Piston*](./redstone_components.md#piston) door that works from 2 sides.

-----

## Self-closing Door

<GameScene interactive={true} zoom={2}>
  <Block x="1" y="0" z="0" id="minecraft:stone_bricks" />
  <Block x="1" y="0" z="1" id="minecraft:stone_bricks" />
  <Block x="1" y="0" z="2" id="minecraft:stone_bricks" />
  <Block x="1" y="1" z="0" id="minecraft:stone_bricks" />
  <Block x="1" y="1" z="1" id="minecraft:iron_door"p:facing="north" p:half="upper" />
  <Block x="1" y="1" z="2" id="minecraft:stone_bricks" />
  <Block x="2" y="1" z="2" id="minecraft:oak_button"p:face="wall" p:facing="south" />
  <Block x="1" y="2" z="0" id="minecraft:stone_bricks" />
  <Block x="0" y="2" z="1" id="minecraft:stone_pressure_plate" />
  <Block x="1" y="2" z="1" id="minecraft:iron_door"p:facing="north" p:half="lower" />
  <Block x="1" y="2" z="2" id="minecraft:stone_bricks" />
  <Block x="0" y="3" z="0" id="minecraft:oak_planks" />
  <Block x="1" y="3" z="0" id="minecraft:oak_planks" />
  <Block x="2" y="3" z="0" id="minecraft:grass_block" />
  <Block x="0" y="3" z="1" id="minecraft:oak_planks" />
  <Block x="1" y="3" z="1" id="minecraft:oak_planks" />
  <Block x="2" y="3" z="1" id="minecraft:grass_block" />
  <Block x="0" y="3" z="2" id="minecraft:oak_planks" />
  <Block x="1" y="3" z="2" id="minecraft:oak_planks" />
  <Block x="2" y="3" z="2" id="minecraft:grass_block" />
</GameScene>

This is a self-closing monster safe door.

-----

## Item Elevator

<GameScene interactive={true} zoom={2}>
  <Block x="0" y="0" z="0" id="minecraft:chest" />
  <Block x="0" y="1" z="0" id="minecraft:dropper"p:facing="up" />
  <Block x="1" y="1" z="0" id="minecraft:cobblestone" />
  <Block x="0" y="1" z="1" id="minecraft:cobblestone" />
  <Block x="1" y="1" z="1" id="minecraft:redstone_wire"p:east="side" p:west="side" p:north="side" p:south="side" p:power="15" />
  <Block x="2" y="1" z="1" id="minecraft:cobblestone" />
  <Block x="0" y="2" z="0" id="minecraft:dropper"p:facing="up" />
  <Block x="1" y="2" z="0" id="minecraft:comparator"p:facing="north" />
  <Block x="2" y="2" z="0" id="minecraft:cobblestone" />
  <Block x="0" y="2" z="1" id="minecraft:redstone_wall_torch"p:facing="north" p:lit="false" />
  <Block x="1" y="2" z="1" id="minecraft:cobblestone" />
  <Block x="2" y="2" z="1" id="minecraft:redstone_wall_torch"p:facing="east" p:lit="true" />
  <Block x="0" y="3" z="0" id="minecraft:dropper"p:facing="up" />
  <Block x="1" y="3" z="0" id="minecraft:cobblestone" />
  <Block x="0" y="3" z="1" id="minecraft:cobblestone" />
  <Block x="1" y="3" z="1" id="minecraft:redstone_wire"p:east="side" p:west="side" p:north="side" p:south="side" p:power="15" />
  <Block x="2" y="3" z="1" id="minecraft:cobblestone" />
  <Block x="0" y="4" z="0" id="minecraft:dropper"p:facing="up" />
  <Block x="1" y="4" z="0" id="minecraft:comparator"p:facing="north" />
  <Block x="2" y="4" z="0" id="minecraft:cobblestone" />
  <Block x="0" y="4" z="1" id="minecraft:redstone_wall_torch"p:facing="north" p:lit="false" />
  <Block x="1" y="4" z="1" id="minecraft:cobblestone" />
  <Block x="2" y="4" z="1" id="minecraft:redstone_wall_torch"p:facing="east" p:lit="true" />
  <Block x="0" y="5" z="0" id="minecraft:dropper"p:facing="up" />
  <Block x="1" y="5" z="0" id="minecraft:cobblestone" />
  <Block x="0" y="5" z="1" id="minecraft:cobblestone" />
  <Block x="1" y="5" z="1" id="minecraft:redstone_wire"p:east="side" p:west="side" p:north="side" p:south="side" p:power="15" />
  <Block x="2" y="5" z="1" id="minecraft:cobblestone" />
  <Block x="0" y="6" z="0" id="minecraft:dropper"p:facing="up" />
  <Block x="1" y="6" z="0" id="minecraft:comparator"p:facing="north" />
  <Block x="2" y="6" z="0" id="minecraft:cobblestone" />
  <Block x="0" y="6" z="1" id="minecraft:redstone_wall_torch"p:facing="north" p:lit="false" />
  <Block x="1" y="6" z="1" id="minecraft:cobblestone" />
  <Block x="2" y="6" z="1" id="minecraft:redstone_wall_torch"p:facing="east" p:lit="true" />
</GameScene>

This is a self-powering item elevator.

-----

## Auto-Smelter

<GameScene zoom={2} interactive={true}>
    <Block x="1" y="3" z="1" id="minecraft:chest" p:facing="north" />

    <Block x="1" y="2" z="1" id="minecraft:hopper" />
    <Block x="1" y="2" z="2" id="minecraft:chest" p:facing="west" />
    
    <Block x="1" y="1" z="1" id="minecraft:furnace" p:facing="north" />
    <Block x="1" y="1" z="2" id="minecraft:hopper" p:facing="north" />
    
    <Block x="1" y="0" z="0" id="minecraft:chest" p:facing="north" />
    <Block x="1" y="0" z="1" id="minecraft:hopper" p:facing="north" />
</GameScene>

this contraption automatically fills fuel and material into the [*Furnace*](../useables/furnace.md) and melts it through automatically.

-----

## Super Smelter

<GameScene zoom={1.5} interactive={true}>
    <Block x="0" y="4" z="1" id="minecraft:chest" p:facing="south" p:type="right" />
    <Block x="1" y="4" z="1" id="minecraft:chest" p:facing="south" p:type="left" />

    <Block x="0" y="3" z="0" id="minecraft:chest" p:facing="south" p:type="right" />
    <Block x="1" y="3" z="0" id="minecraft:chest" p:facing="south" p:type="left" />
    <Block x="2" y="3" z="0" id="minecraft:redstone_block" />
    <Block x="9" y="3" z="0" id="minecraft:redstone_block" />
    <Entity x="5" y="3" z="0" id="minecraft:hopper_minecart" />
    
    <Block x="0" y="3" z="1" id="minecraft:cobblestone" />
    <Block x="1" y="3" z="1" id="minecraft:powered_rail" p:shape="east_west" p:powered="true" />
    <Block x="2" y="3" z="1" id="minecraft:powered_rail" p:shape="east_west" p:powered="true" />
    <Block x="3" y="3" z="1" id="minecraft:powered_rail" p:shape="east_west" p:powered="true" />
    <Block x="4" y="3" z="1" id="minecraft:rail" p:shape="east_west" />
    <Block x="5" y="3" z="1" id="minecraft:rail" p:shape="east_west" />
    <Block x="6" y="3" z="1" id="minecraft:rail" p:shape="east_west" />
    <Block x="7" y="3" z="1" id="minecraft:rail" p:shape="east_west" />
    <Block x="8" y="3" z="1" id="minecraft:powered_rail" p:shape="east_west" p:powered="true" />
    <Block x="9" y="3" z="1" id="minecraft:powered_rail" p:shape="east_west" p:powered="true" />
    <Block x="10" y="3" z="1" id="minecraft:powered_rail" p:shape="east_west" p:powered="true" />
    <Block x="11" y="3" z="1" id="minecraft:cobblestone" />
    <Entity x="6" y="4" z="1" id="minecraft:hopper_minecart" />

    <Block x="0" y="2" z="0" id="minecraft:cobblestone" />
    <Block x="1" y="2" z="0" id="minecraft:powered_rail" p:shape="east_west" p:powered="true" />
    <Block x="2" y="2" z="0" id="minecraft:powered_rail" p:shape="east_west" p:powered="true" />
    <Block x="3" y="2" z="0" id="minecraft:powered_rail" p:shape="east_west" p:powered="true" />
    <Block x="4" y="2" z="0" id="minecraft:rail" p:shape="east_west" />
    <Block x="5" y="2" z="0" id="minecraft:rail" p:shape="east_west" />
    <Block x="6" y="2" z="0" id="minecraft:rail" p:shape="east_west" />
    <Block x="7" y="2" z="0" id="minecraft:rail" p:shape="east_west" />
    <Block x="8" y="2" z="0" id="minecraft:powered_rail" p:shape="east_west" p:powered="true" />
    <Block x="9" y="2" z="0" id="minecraft:powered_rail" p:shape="east_west" p:powered="true" />
    <Block x="10" y="2" z="0" id="minecraft:powered_rail" p:shape="east_west" p:powered="true" />
    <Block x="11" y="2" z="0" id="minecraft:cobblestone" />
    
    <Block x="1" y="2" z="1" id="minecraft:hopper" />
    <Block x="2" y="2" z="1" id="minecraft:hopper" />
    <Block x="3" y="2" z="1" id="minecraft:hopper" />
    <Block x="4" y="2" z="1" id="minecraft:hopper" />
    <Block x="5" y="2" z="1" id="minecraft:hopper" />
    <Block x="6" y="2" z="1" id="minecraft:hopper" />
    <Block x="7" y="2" z="1" id="minecraft:hopper" />
    <Block x="8" y="2" z="1" id="minecraft:hopper" />
    <Block x="9" y="2" z="1" id="minecraft:hopper" />
    <Block x="10" y="2" z="1" id="minecraft:hopper" />

    <Block x="1" y="1" z="0" id="minecraft:hopper" p:facing="south" />
    <Block x="2" y="1" z="0" id="minecraft:hopper" p:facing="south" />
    <Block x="3" y="1" z="0" id="minecraft:hopper" p:facing="south" />
    <Block x="4" y="1" z="0" id="minecraft:hopper" p:facing="south" />
    <Block x="5" y="1" z="0" id="minecraft:hopper" p:facing="south" />
    <Block x="6" y="1" z="0" id="minecraft:hopper" p:facing="south" />
    <Block x="7" y="1" z="0" id="minecraft:hopper" p:facing="south" />
    <Block x="8" y="1" z="0" id="minecraft:hopper" p:facing="south" />
    <Block x="9" y="1" z="0" id="minecraft:hopper" p:facing="south" />
    <Block x="10" y="1" z="0" id="minecraft:hopper" p:facing="south" />
    
    <Block x="1" y="1" z="1" id="minecraft:blast_furnace" p:facing="south" />
    <Block x="2" y="1" z="1" id="minecraft:blast_furnace" p:facing="south" />
    <Block x="3" y="1" z="1" id="minecraft:blast_furnace" p:facing="south" />
    <Block x="4" y="1" z="1" id="minecraft:blast_furnace" p:facing="south" />
    <Block x="5" y="1" z="1" id="minecraft:blast_furnace" p:facing="south" />
    <Block x="6" y="1" z="1" id="minecraft:blast_furnace" p:facing="south" />
    <Block x="7" y="1" z="1" id="minecraft:blast_furnace" p:facing="south" />
    <Block x="8" y="1" z="1" id="minecraft:blast_furnace" p:facing="south" />
    <Block x="9" y="1" z="1" id="minecraft:blast_furnace" p:facing="south" />
    <Block x="10" y="1" z="1" id="minecraft:blast_furnace" p:facing="south" />
  
    <Block x="1" y="0" z="1" id="minecraft:hopper" p:facing="south" />
    <Block x="2" y="0" z="1" id="minecraft:hopper" p:facing="west" />
    <Block x="3" y="0" z="1" id="minecraft:hopper" p:facing="west" />
    <Block x="4" y="0" z="1" id="minecraft:hopper" p:facing="west" />
    <Block x="5" y="0" z="1" id="minecraft:hopper" p:facing="west" />
    <Block x="6" y="0" z="1" id="minecraft:hopper" p:facing="west" />
    <Block x="7" y="0" z="1" id="minecraft:hopper" p:facing="west" />
    <Block x="8" y="0" z="1" id="minecraft:hopper" p:facing="west" />
    <Block x="9" y="0" z="1" id="minecraft:hopper" p:facing="west" />
    <Block x="10" y="0" z="1" id="minecraft:hopper" p:facing="west" />
    
    <Block x="0" y="0" z="2" id="minecraft:chest" p:facing="south" p:type="right" />
    <Block x="1" y="0" z="2" id="minecraft:chest" p:facing="south" p:type="left" />
</GameScene>

The best way to smelt a lot of ores after a mining session. You have to place *Hopper Minecarts* on the *Rails*, they distribute the materials.

-----

## Elytra Launcher

<GameScene interactive={true} zoom={2}>
  <Block x="1" y="0" z="0" id="minecraft:stone_pressure_plate" />
  <Block x="0" y="0" z="1" id="minecraft:stone_pressure_plate" />
  <Block x="2" y="0" z="1" id="minecraft:stone_pressure_plate" />
  <Block x="1" y="0" z="2" id="minecraft:stone_pressure_plate" />
  <Block x="0" y="1" z="0" id="minecraft:cobblestone" />
  <Block x="1" y="1" z="0" id="minecraft:obsidian" />
  <Block x="2" y="1" z="0" id="minecraft:cobblestone" />
  <Block x="0" y="1" z="1" id="minecraft:obsidian" />
  <Block x="1" y="1" z="1" id="minecraft:slime_block" />
  <Block x="2" y="1" z="1" id="minecraft:obsidian" />
  <Block x="0" y="1" z="2" id="minecraft:cobblestone" />
  <Block x="1" y="1" z="2" id="minecraft:obsidian" />
  <Block x="2" y="1" z="2" id="minecraft:cobblestone" />
  <Block x="1" y="2" z="0" id="minecraft:redstone_wire"p:east="side" p:west="side" p:south="side" p:north="side" />
  <Block x="0" y="2" z="1" id="minecraft:redstone_wire"p:east="side" p:west="side" p:south="side" p:north="side" />
  <Block x="1" y="2" z="1" id="minecraft:sticky_piston"p:facing="up" />
  <Block x="2" y="2" z="1" id="minecraft:redstone_wire"p:east="side" p:west="side" p:south="side" p:north="side" />
  <Block x="1" y="2" z="2" id="minecraft:redstone_wire"p:east="side" p:west="side" p:south="side" p:north="side" />
</GameScene>

Is used to throw you into the air for an *Elytra* launch.

