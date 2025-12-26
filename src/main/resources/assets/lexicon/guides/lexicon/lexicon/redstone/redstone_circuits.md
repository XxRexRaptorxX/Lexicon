---
navigation:
  title: "Redstone Circuits"
  icon: "minecraft:comparator"
  position: 3
  parent: lexicon:redstone.md
---

# Redstone Circuits

A logic gate can be thought of as a simple device that will return a number of outputs, determined by the pattern of inputs and rules that the logic gate follows. 

These gates can be used to build large circuits for machines. 

The [*Lever*](./redstone_components.md#lever) in these circuits represent inputs and the [*Lamps*](./redstone_components.md#lamp) the output.

-----

## NOT-Gate

<GameScene zoom={2} interactive={true}>
    <Block x="0" y="0" z="0" id="minecraft:redstone_lamp" p:lit="true" />
    <Block x="1" y="0" z="0" id="minecraft:redstone_wire" p:north="side" p:south="side" p:power="15" />
    <Block x="2" y="0" z="0" id="minecraft:redstone_wall_torch" p:facing="west" p:lit="true" />
    <Block x="3" y="0" z="0" id="minecraft:gold_block" />
    <Block x="4" y="0" z="0" id="minecraft:redstone_wire" p:north="side" p:south="side" />
    <Block x="5" y="0" z="0" id="minecraft:lever" p:facing="south" p:face="floor" p:powered="false" />
</GameScene>

Also known as inverter. 
This gate is used when an opposite output is wanted from the input given.

-----

## OR-Gate

<GameScene zoom={2} interactive={true}>
    <Block x="3" y="1" z="2" id="minecraft:redstone_wire" p:north="side" p:south="side" p:power="15" />
    <Block x="4" y="1" z="2" id="minecraft:redstone_torch" p:lit="true" />

    <Block x="4" y="0" z="0" id="minecraft:lever" p:facing="south" p:face="floor" p:powered="false" />
    <Block x="4" y="0" z="1" id="minecraft:redstone_wire" p:south="side" p:north="side" />
    <Block x="0" y="0" z="2" id="minecraft:redstone_lamp" p:lit="false" />
    <Block x="1" y="0" z="2" id="minecraft:redstone_wire" p:north="side" p:south="side" />
    <Block x="2" y="0" z="2" id="minecraft:redstone_wall_torch" p:facing="west" p:lit="false" />
    <Block x="3" y="0" z="2" id="minecraft:gold_block" />
    <Block x="4" y="0" z="2" id="minecraft:gold_block" />
    <Block x="5" y="0" z="2" id="minecraft:redstone_wire" p:north="side" p:south="side" />
    <Block x="6" y="0" z="2" id="minecraft:lever" p:facing="south" p:face="floor" p:powered="false" />
    <Block x="4" y="0" z="3" id="minecraft:redstone_wire" p:east="side" p:west="side" />
    <Block x="4" y="0" z="4" id="minecraft:lever" p:facing="south" p:face="floor" p:powered="false" />
</GameScene>

A gate which is used 2 or more inputs and whenever any input is **on**, the output is **off**.

-----

## Simple OR-Gate

<GameScene zoom={2} interactive={true}>
    <Block x="2" y="0" z="0" id="minecraft:lever" p:facing="south" p:face="floor" p:powered="false" />
    <Block x="2" y="0" z="1" id="minecraft:redstone_wire" p:east="side" p:west="side" />
    <Block x="0" y="0" z="2" id="minecraft:redstone_lamp" p:lit="false" />
    <Block x="1" y="0" z="2" id="minecraft:redstone_wire" p:north="side" p:south="side" />
    <Block x="2" y="0" z="2" id="minecraft:redstone_wire" p:north="side" p:south="side" p:west="side" p:east="side" />
    <Block x="3" y="0" z="2" id="minecraft:redstone_wire" p:north="side" p:south="side" />
    <Block x="4" y="0" z="2" id="minecraft:lever" p:facing="south" p:face="floor" p:powered="false" />
    <Block x="2" y="0" z="3" id="minecraft:redstone_wire" p:east="side" p:west="side" />
    <Block x="2" y="0" z="4" id="minecraft:lever" p:facing="south" p:face="floor" p:powered="false" />
</GameScene>

But an OR-Gate in minecraft can also be a simple redstone connection.

-----

## NOR-Gate

<GameScene zoom={2} interactive={true}>
    <Block x="3" y="0" z="0" id="minecraft:lever" p:facing="south" p:face="floor" p:powered="false" />
    <Block x="3" y="0" z="1" id="minecraft:redstone_wire" p:south="side" p:north="side" />
    <Block x="0" y="0" z="2" id="minecraft:redstone_lamp" p:lit="true" />
    <Block x="1" y="0" z="2" id="minecraft:redstone_wire" p:north="side" p:south="side" p:power="15" />
    <Block x="2" y="0" z="2" id="minecraft:redstone_wall_torch" p:facing="west" p:lit="true" />
    <Block x="3" y="0" z="2" id="minecraft:gold_block" />
    <Block x="4" y="0" z="2" id="minecraft:redstone_wire" p:north="side" p:south="side" />
    <Block x="5" y="0" z="2" id="minecraft:lever" p:facing="south" p:face="floor" p:powered="false" />
    <Block x="3" y="0" z="3" id="minecraft:redstone_wire" p:east="side" p:west="side" />
    <Block x="3" y="0" z="4" id="minecraft:lever" p:facing="south" p:face="floor" p:powered="false" />
</GameScene>

This gate is the opposite of the *OR-Gate*. Whenever at least one switch is toggled to **on**, the output is toggled to **off**.

-----

## AND-Gate

<GameScene zoom={2} interactive={true}>
    <Block x="3" y="1" z="2" id="minecraft:redstone_torch" p:lit="true" />
    <Block x="3" y="1" z="3" id="minecraft:redstone_wire" p:east="side" p:west="side" p:south="side" p:north="side" p:power="15" />
    <Block x="4" y="1" z="3" id="minecraft:redstone_torch" p:lit="true" />
    <Block x="3" y="1" z="4" id="minecraft:redstone_torch" p:lit="true" />

    <Block x="3" y="0" z="0" id="minecraft:lever" p:facing="south" p:face="floor" p:powered="false" />
    <Block x="3" y="0" z="1" id="minecraft:redstone_wire" p:south="side" p:north="side" />
    <Block x="3" y="0" z="2" id="minecraft:gold_block" />
    <Block x="0" y="0" z="3" id="minecraft:redstone_lamp" p:lit="false" />
    <Block x="1" y="0" z="3" id="minecraft:redstone_wire" p:north="side" p:south="side" />
    <Block x="2" y="0" z="3" id="minecraft:redstone_wall_torch" p:facing="west" p:lit="false" />
    <Block x="3" y="0" z="3" id="minecraft:gold_block" />
    <Block x="4" y="0" z="3" id="minecraft:gold_block" />
    <Block x="5" y="0" z="3" id="minecraft:redstone_wire" p:north="side" p:south="side" />
    <Block x="6" y="0" z="3" id="minecraft:lever" p:facing="south" p:face="floor" p:powered="false" />
    <Block x="3" y="0" z="4" id="minecraft:gold_block" />
    <Block x="3" y="0" z="5" id="minecraft:redstone_wire" p:east="side" p:west="side" />
    <Block x="3" y="0" z="6" id="minecraft:lever" p:facing="south" p:face="floor" p:powered="false" />
</GameScene>

The output is toggled to **on** only when __all__ inputs are **on**. Otherwise, the output will remain **off**.

-----

## AND-Gate

<GameScene zoom={2} interactive={true}>
    <Block x="3" y="1" z="0" id="minecraft:redstone_torch" p:lit="true" />
    <Block x="3" y="1" z="1" id="minecraft:redstone_wire" p:east="side" p:west="side" p:power="15" />
    <Block x="3" y="1" z="2" id="minecraft:redstone_torch" p:lit="true" />

    <Block x="3" y="0" z="0" id="minecraft:gold_block" />
    <Block x="4" y="0" z="0" id="minecraft:redstone_wire" p:north="side" p:south="side" />
    <Block x="5" y="0" z="0" id="minecraft:lever" p:facing="south" p:face="floor" p:powered="false" />
    <Block x="0" y="0" z="1" id="minecraft:redstone_lamp" p:lit="false" />
    <Block x="1" y="0" z="1" id="minecraft:redstone_wire" p:north="side" p:south="side" />
    <Block x="2" y="0" z="1" id="minecraft:redstone_wall_torch" p:facing="west" p:lit="false" />
    <Block x="3" y="0" z="1" id="minecraft:gold_block" />
    <Block x="3" y="0" z="2" id="minecraft:gold_block" />
    <Block x="4" y="0" z="2" id="minecraft:redstone_wire" p:north="side" p:south="side" />
    <Block x="5" y="0" z="2" id="minecraft:lever" p:facing="south" p:face="floor" p:powered="false" />
</GameScene>

The previous variant of the AND-Gate is for 3 inputs and this one for 2.

-----

## NAND-Gate

<GameScene zoom={2} interactive={true}>
    <Block x="2" y="1" z="0" id="minecraft:redstone_torch" p:lit="true" />
    <Block x="2" y="1" z="1" id="minecraft:redstone_wire" p:east="side" p:west="side" p:north="side" p:power="15" />
    <Block x="2" y="1" z="2" id="minecraft:redstone_torch" p:lit="true" />

    <Block x="2" y="0" z="0" id="minecraft:gold_block" />
    <Block x="3" y="0" z="0" id="minecraft:redstone_wire" p:north="side" p:south="side" />
    <Block x="4" y="0" z="0" id="minecraft:lever" p:facing="south" p:face="floor" p:powered="false" />
    <Block x="0" y="0" z="1" id="minecraft:redstone_lamp" p:lit="true" />
    <Block x="1" y="0" z="1" id="minecraft:redstone_wire" p:north="side" p:south="side" p:power="14" />
    <Block x="2" y="0" z="1" id="minecraft:gold_block" />
    <Block x="2" y="0" z="2" id="minecraft:gold_block" />
    <Block x="3" y="0" z="2" id="minecraft:redstone_wire" p:north="side" p:south="side" />
    <Block x="4" y="0" z="2" id="minecraft:lever" p:facing="south" p:face="floor" p:powered="false" />
</GameScene>

This gate turns the output **off** only when __all__ inputs are **on**, the reverse of an *AND-Gate*.

-----

## XOR-Gate

<GameScene zoom={2} interactive={true}>
    <Block x="2" y="0" z="0" id="minecraft:redstone_wire" p:east="side" p:south="side" p:power="15" />
    <Block x="3" y="0" z="0" id="minecraft:redstone_wall_torch" p:facing="west" p:lit="true" />
    <Block x="4" y="0" z="0" id="minecraft:gold_block" />
    <Block x="5" y="0" z="0" id="minecraft:redstone_wire" p:north="side" p:south="side" />
    <Block x="6" y="0" z="0" id="minecraft:lever" p:facing="south" p:face="floor" p:powered="false" />
    <Block x="0" y="0" z="1" id="minecraft:redstone_lamp" p:lit="false" />
    <Block x="1" y="0" z="1" id="minecraft:redstone_wire" p:north="side" p:south="side" />
    <Block x="2" y="0" z="1" id="minecraft:comparator" p:facing="east" p:mode="subtract" />
    <Block x="3" y="0" z="1" id="minecraft:redstone_wire" p:east="side" p:north="side" p:west="side" p:power="15" />
    <Block x="1" y="0" z="2" id="minecraft:gold_block" />
    <Block x="2" y="0" z="2" id="minecraft:comparator" p:facing="east" p:mode="subtract" />
    <Block x="3" y="0" z="2" id="minecraft:redstone_wire" p:east="side" p:north="side" p:west="side" p:power="15" />
    <Block x="2" y="0" z="3" id="minecraft:redstone_wire" p:west="side" p:south="side" p:power="15" />
    <Block x="3" y="0" z="3" id="minecraft:redstone_wall_torch" p:facing="west" p:lit="true" />
    <Block x="4" y="0" z="3" id="minecraft:gold_block" />
    <Block x="5" y="0" z="3" id="minecraft:redstone_wire" p:north="side" p:south="side" />
    <Block x="6" y="0" z="3" id="minecraft:lever" p:facing="south" p:face="floor" p:powered="false" />
</GameScene>

This gate that uses 2 inputs and the output is toggled to **on** when one switch is **on** and one switch is **off**.

-----

## XNOR-Gate

<GameScene zoom={2} interactive={true}>
    <Block x="3" y="1" z="0" id="minecraft:redstone_wire" p:north="side" p:south="side" p:power="14" />
    <Block x="6" y="1" z="0" id="minecraft:redstone_torch" p:lit="true" />
    <Block x="4" y="1" z="1" id="minecraft:redstone_wire" p:east="side" p:west="side" p:north="side" p:power="15" />
    <Block x="3" y="1" z="2" id="minecraft:redstone_wire" p:north="side" p:south="side" p:power="14" />
    <Block x="6" y="1" z="2" id="minecraft:redstone_torch" p:lit="true" />

    <Block x="2" y="0" z="0" id="minecraft:redstone_wall_torch" p:facing="west" p:lit="false" />
    <Block x="3" y="0" z="0" id="minecraft:gold_block" />
    <Block x="4" y="0" z="0" id="minecraft:redstone_wire" p:east="side" p:south="side" p:west="up" p:power="15" />
    <Block x="5" y="0" z="0" id="minecraft:redstone_wall_torch" p:facing="west" p:lit="true" />
    <Block x="6" y="0" z="0" id="minecraft:gold_block" />
    <Block x="7" y="0" z="0" id="minecraft:redstone_wire" p:north="side" p:south="side" />
    <Block x="8" y="0" z="0" id="minecraft:lever" p:facing="south" p:face="floor" p:powered="false" />
    <Block x="0" y="0" z="1" id="minecraft:redstone_lamp" p:lit="false" />
    <Block x="1" y="0" z="1" id="minecraft:redstone_wire" p:north="side" p:south="side" />
    <Block x="2" y="0" z="1" id="minecraft:redstone_wire" p:east="side" p:north="side" p:west="side" />
    <Block x="3" y="0" z="1" id="minecraft:redstone_wall_torch" p:facing="west" p:lit="false" />
    <Block x="4" y="0" z="1" id="minecraft:gold_block" />
    <Block x="5" y="0" z="1" id="minecraft:gold_block" />
    <Block x="2" y="0" z="2" id="minecraft:redstone_wall_torch" p:facing="west" p:lit="false" />
    <Block x="3" y="0" z="2" id="minecraft:gold_block" />
    <Block x="4" y="0" z="2" id="minecraft:redstone_wire" p:west="side" p:south="side" p:north="up" p:power="15" />
    <Block x="5" y="0" z="2" id="minecraft:redstone_wall_torch" p:facing="west" p:lit="true" />
    <Block x="6" y="0" z="2" id="minecraft:gold_block" />
    <Block x="7" y="0" z="2" id="minecraft:redstone_wire" p:north="side" p:south="side" />
    <Block x="8" y="0" z="2" id="minecraft:lever" p:facing="south" p:face="floor" p:powered="false" />
</GameScene>

The opposite of an *XOR-Gate*. It uses 2 inputs. When both switches are in the same state (both switches are **on** or both are **off**), then the output is toggled to **on**.

-----

## IMPLY-Gate

<GameScene zoom={2} interactive={true}>
    <Block x="2" y="1" z="0" id="minecraft:redstone_wire" p:south="side" p:east="side" p:power="14" />
    <Block x="2" y="1" z="1" id="minecraft:redstone_wire" p:east="side" p:west="side" p:north="side" p:power="15" />
    <Block x="2" y="1" z="2" id="minecraft:redstone_torch" p:lit="true" />

    <Block x="2" y="0" z="0" id="minecraft:gold_block" />
    <Block x="3" y="0" z="0" id="minecraft:redstone_wire" p:north="up" p:south="side" p:power="13" />
    <Block x="4" y="0" z="0" id="minecraft:lever" p:facing="south" p:face="floor" p:powered="false" />
    <Block x="0" y="0" z="1" id="minecraft:redstone_lamp" p:lit="true" />
    <Block x="1" y="0" z="1" id="minecraft:redstone_wire" p:north="side" p:south="up" p:power="15" />
    <Block x="2" y="0" z="1" id="minecraft:gold_block" />
    <Block x="2" y="0" z="2" id="minecraft:gold_block" />
    <Block x="3" y="0" z="2" id="minecraft:redstone_wire" p:north="side" p:south="side" />
    <Block x="4" y="0" z="2" id="minecraft:lever" p:facing="south" p:face="floor" p:powered="false" />
</GameScene>

This gate turns on either if both inputs are **on**, or if the first input is **off**. 
Unlike the other gates, the inputs are not interchangeable; it's not commutative.

-----

## Hopper-Clock

<GameScene zoom={2} interactive={true}>
  <Block x="0" y="0" z="0" id="minecraft:redstone_lamp"p:lit="true" />
  <Block x="1" y="0" z="0" id="minecraft:comparator"p:facing="east" p:mode="compare" p:powered="true" />
  <Block x="2" y="0" z="0" id="minecraft:hopper"p:enabled="true" p:facing="south" />
  <Block x="2" y="0" z="1" id="minecraft:hopper"p:enabled="true" p:facing="north" />
</GameScene>

A clock is a pulse generator that produces a loop of specific pulses repeatedly. A hopper clock produces timed pulses by moving items back and forth between 2 [*Hoppers*](./redstone_components.md#hopper).

-----

## Comparator-Clock

<GameScene zoom={2} interactive={true}>
    <Block x="0" y="0" z="0" id="minecraft:redstone_lamp" p:lit="true" />
    <Block x="1" y="0" z="0" id="minecraft:redstone_wire" p:north="side" p:south="side" p:power="14" />
    <Block x="2" y="0" z="0" id="minecraft:redstone_wire" p:north="side" p:south="side" p:east="side" p:power="15" />
    <Block x="3" y="0" z="0" id="minecraft:comparator" p:facing="east" p:mode="subtract" p:powered="true" />
    <Block x="4" y="0" z="0" id="minecraft:lever" p:face="floor" p:facing="south" p:powered="true" />
    <Block x="2" y="0" z="1" id="minecraft:redstone_wire" p:west="side" p:south="side" p:power="14" />
    <Block x="3" y="0" z="1" id="minecraft:redstone_wire" p:west="side" p:north="side" p:power="13" />
</GameScene>

The clock of short or moderate cycle length utilizing [*Comparator's*](./redstone_components.md#comparator) subtraction or signal fading feature.

-----

## Repeater-Clock

<GameScene zoom={2} interactive={true}>
    <Block x="0" y="0" z="0" id="minecraft:redstone_lamp" p:lit="true" />
    <Block x="1" y="0" z="0" id="minecraft:redstone_wire" p:north="side" p:south="side" p:power="14" />
    <Block x="2" y="0" z="0" id="minecraft:redstone_wire" p:east="side" p:south="side" p:north="side" p:power="15" />
    <Block x="3" y="0" z="0" id="minecraft:repeater" p:powered="true" p:delay="4" p:facing="east" />
    <Block x="4" y="0" z="0" id="minecraft:redstone_wire" p:north="side" p:east="side" />
    <Block x="2" y="0" z="1" id="minecraft:repeater" p:powered="true" p:delay="4" p:facing="north" />
    <Block x="4" y="0" z="1" id="minecraft:repeater" p:powered="false" p:delay="4" p:facing="south" />
    <Block x="2" y="0" z="2" id="minecraft:redstone_wire" p:west="side" p:south="side" p:power="15" />
    <Block x="3" y="0" z="2" id="minecraft:repeater" p:powered="false" p:delay="4" p:facing="west" />
    <Block x="4" y="0" z="2" id="minecraft:redstone_wire" p:north="side" p:west="side" p:south="side" p:power="0" />
    <Block x="5" y="0" z="2" id="minecraft:stone_button" p:face="floor" p:facing="south" p:powered="false" />
</GameScene>

This clock consists of a loop of [*Repeaters*](./redstone_components.md#repeater) with occasional dust or blocks to draw off the appropriate pulses.

<GameScene zoom={2} interactive={true}>
    <Block x="0" y="0" z="0" id="minecraft:redstone_lamp" p:lit="true" />
    <Block x="1" y="0" z="0" id="minecraft:redstone_wire" p:north="side" p:south="side" p:power="14" />
    <Block x="2" y="0" z="0" id="minecraft:redstone_wire" p:east="side" p:south="side" p:north="side" p:power="15" />
    <Block x="3" y="0" z="0" id="minecraft:repeater" p:powered="true" p:delay="4" p:facing="east" />
    <Block x="4" y="0" z="0" id="minecraft:redstone_wire" p:north="side" p:east="side" />
    <Block x="2" y="0" z="1" id="minecraft:repeater" p:powered="true" p:delay="4" p:facing="north" />
    <Block x="2" y="0" z="2" id="minecraft:repeater" p:powered="true" p:delay="4" p:facing="north" />
    <Block x="2" y="0" z="3" id="minecraft:repeater" p:powered="false" p:delay="4" p:facing="north" />
    <Block x="4" y="0" z="3" id="minecraft:repeater" p:powered="false" p:delay="4" p:facing="south" />
    <Block x="4" y="0" z="2" id="minecraft:repeater" p:powered="false" p:delay="4" p:facing="south" />
    <Block x="4" y="0" z="1" id="minecraft:repeater" p:powered="false" p:delay="4" p:facing="south" />
    <Block x="2" y="0" z="4" id="minecraft:redstone_wire" p:west="side" p:south="side" p:power="0" />
    <Block x="3" y="0" z="4" id="minecraft:repeater" p:powered="false" p:delay="4" p:facing="west" />
    <Block x="4" y="0" z="4" id="minecraft:redstone_wire" p:north="side" p:west="side" p:south="side" p:power="0" />
    <Block x="5" y="0" z="4" id="minecraft:oak_button" p:face="floor" p:facing="south" p:powered="false" />
</GameScene>

The duration between pulses can be changed as desired by adjusting and adding [*Repeaters*](./redstone_components.md#repeater). In addition, the length of the start pulse is also stored.

-----

<a name="t-flip-flop"></a>
## T Flip-flop

<GameScene zoom={2} interactive={true}>
    <Block x="2" y="0" z="0" id="minecraft:redstone_wall_torch" p:facing="west" p:lit="true" />
    <Block x="3" y="0" z="0" id="minecraft:gold_block" />
    <Block x="4" y="0" z="0" id="minecraft:redstone_wire" p:north="side" p:south="side" />
    <Block x="5" y="0" z="0" id="minecraft:stone_button" p:face="floor" p:facing="south" p:powered="false" />
    <Block x="2" y="0" z="1" id="minecraft:repeater" p:powered="true" p:delay="1" p:facing="north" />
    <Block x="0" y="0" z="2" id="minecraft:redstone_lamp" p:lit="true" />
    <Block x="1" y="0" z="2" id="minecraft:redstone_wire" p:west="side" p:east="side" p:power="15" />
    <Block x="2" y="0" z="2" id="minecraft:gold_block" />
    <Block x="3" y="0" z="2" id="minecraft:repeater" p:powered="true" p:delay="3" p:facing="east" p:locked="true" />
    <Block x="4" y="0" z="2" id="minecraft:redstone_wire" p:north="side" p:south="side" />
    <Block x="5" y="0" z="2" id="minecraft:redstone_wire" p:east="side" p:north="side" />
    <Block x="2" y="0" z="3" id="minecraft:redstone_wall_torch" p:facing="south" p:lit="false" />
    <Block x="3" y="0" z="3" id="minecraft:repeater" p:powered="false" p:delay="4" p:facing="west" />
    <Block x="4" y="0" z="3" id="minecraft:repeater" p:powered="false" p:delay="4" p:facing="west" />
    <Block x="5" y="0" z="3" id="minecraft:redstone_wire" p:west="side" p:north="side" />
</GameScene>

Also known as 'toggles'. Whenever the input changes from **off** to **on**, the output will toggle its state.

-----

## Simple Copper Bulb T Flip-flop

<GameScene interactive={true} zoom={2}>
  <Block x="4" y="0" z="0" id="minecraft:redstone_lamp"p:lit="false" />
  <Block x="5" y="0" z="0" id="minecraft:comparator"p:facing="east" />
  <Block x="6" y="0" z="0" id="minecraft:copper_bulb" />
  <Block x="7" y="0" z="0" id="minecraft:redstone_wire"p:north="side" p:south="side" />
  <Block x="8" y="0" z="0" id="minecraft:stone_button"p:face="floor" p:facing="north" p:powered="false" />
</GameScene>

-----

## Observer T Flip-flop

<GameScene interactive={true} zoom={2}>
  <Block x="0" y="0" z="0" id="minecraft:redstone_lamp"p:lit="false" />
  <Block x="2" y="0" z="0" id="minecraft:redstone_block" />
  <Block x="3" y="0" z="0" id="minecraft:sticky_piston"p:facing="west" />
  <Block x="5" y="0" z="0" id="minecraft:observer"p:facing="east" />
  <Block x="6" y="0" z="0" id="minecraft:sticky_piston"p:facing="west" />
  <Block x="7" y="0" z="0" id="minecraft:redstone_wire"p:north="side" p:south="side" />
  <Block x="8" y="0" z="0" id="minecraft:stone_button"p:face="floor" p:facing="north" p:powered="false" />
</GameScene>

-----

## Randomizer

<GameScene zoom={2} interactive={true}>
    <Block x="0" y="1" z="0" id="minecraft:redstone_wire" p:north="side" p:south="side" />
    <Block x="1" y="1" z="0" id="minecraft:redstone_wire" p:north="side" p:south="side" />
    <Block x="2" y="1" z="0" id="minecraft:redstone_wire" p:north="side" p:south="side" />
    <Block x="3" y="1" z="0" id="minecraft:comparator" p:facing="east" />
    <Block x="4" y="1" z="0" id="minecraft:hopper" p:facing="east" p:enabled="true" />
    <Block x="5" y="1" z="0" id="minecraft:dropper" p:facing="west" />
    <Block x="6" y="1" z="0" id="minecraft:redstone_wire" p:north="side" p:south="side" />
    <Block x="7" y="1" z="0" id="minecraft:stone_button" p:face="floor" p:facing="south" p:powered="false" />
    <Block x="0" y="0" z="0" id="minecraft:redstone_lamp" p:lit="false" />
    <Block x="1" y="0" z="0" id="minecraft:redstone_lamp" p:lit="false" />
    <Block x="2" y="0" z="0" id="minecraft:redstone_lamp" p:lit="false" />
</GameScene>

Put items of varying stack size into the [*Dropper*](./redstone_components.md#dropper), e.g. a *Sword* and a piece of *Dirt*.

-----

## Input Stabilizator

<GameScene interactive={true} zoom={2}>
  <Block x="2" y="0" z="0" id="minecraft:redstone_wire"p:south="side" p:east="side" />
  <Block x="3" y="0" z="0" id="minecraft:redstone_wire"p:north="side" p:south="side" />
  <Block x="4" y="0" z="0" id="minecraft:redstone_wire"p:north="side" p:east="side" />
  <Block x="0" y="0" z="1" id="minecraft:redstone_lamp"p:lit="false" />
  <Block x="1" y="0" z="1" id="minecraft:redstone_wire"p:north="side" p:south="side" />
  <Block x="2" y="0" z="1" id="minecraft:redstone_wire"p:north="side" p:south="side" p:west="side" />
  <Block x="3" y="0" z="1" id="minecraft:repeater"p:facing="east" />
  <Block x="4" y="0" z="1" id="minecraft:redstone_wire"p:north="side" p:south="side" p:west="side" />
  <Block x="5" y="0" z="1" id="minecraft:redstone_wire"p:north="side" p:south="side" />
  <Block x="6" y="0" z="1" id="minecraft:stone_button"p:face="floor" p:facing="north" p:powered="false" />
</GameScene>

This circuit responds to an input pulse by turning its input & output **on** and leaving it **on**.

-----

## RS-ISR Latch

<GameScene interactive={true} zoom={2}>
  <Block x="1" y="0" z="0" id="minecraft:redstone_lamp"p:lit="false" />
  <Block x="1" y="0" z="1" id="minecraft:redstone_wire"p:east="side" p:west="side" />
  <Block x="0" y="0" z="2" id="minecraft:redstone_wire"p:east="side" p:south="side" />
  <Block x="1" y="0" z="2" id="minecraft:redstone_wall_torch"p:facing="west" p:lit="false" />
  <Block x="2" y="0" z="2" id="minecraft:gold_block" />
  <Block x="3" y="0" z="2" id="minecraft:redstone_wire"p:north="side" p:south="side" />
  <Block x="4" y="0" z="2" id="minecraft:oak_button"p:face="floor" p:facing="north" p:powered="false" />
  <Block x="0" y="0" z="3" id="minecraft:redstone_wire"p:east="side" p:west="side" />
  <Block x="2" y="0" z="3" id="minecraft:repeater"p:facing="south" p:powered="true" />
  <Block x="0" y="0" z="4" id="minecraft:redstone_wire"p:east="side" p:west="side" />
  <Block x="2" y="0" z="4" id="minecraft:redstone_wall_torch"p:facing="north" p:lit="true" />
  <Block x="0" y="0" z="5" id="minecraft:redstone_wire"p:south="side" p:west="side" />
  <Block x="1" y="0" z="5" id="minecraft:redstone_wire"p:north="side" p:south="side" />
  <Block x="2" y="0" z="5" id="minecraft:gold_block" />
  <Block x="3" y="0" z="5" id="minecraft:redstone_wire"p:north="side" p:south="side" />
  <Block x="4" y="0" z="5" id="minecraft:stone_button"p:face="floor" p:facing="north" p:powered="false" />
</GameScene>

This is an *Input Stabilizator* with reset option.

-----

## Pulse Generator / Pulse Limiter

<GameScene interactive={true} zoom={2}>
  <Block x="0" y="1" z="0" id="minecraft:redstone_lamp"p:lit="false" />
  <Block x="1" y="1" z="0" id="minecraft:repeater"p:facing="east" />
  <Block x="2" y="1" z="0" id="minecraft:gold_block" />
  <Block x="3" y="1" z="0" id="minecraft:redstone_wire"p:north="side" p:south="side" />
  <Block x="4" y="1" z="0" id="minecraft:lever"p:facing="north" p:face="floor" p:powered="false" />
  <Block x="2" y="0" z="0" id="minecraft:sticky_piston"p:facing="up" />
</GameScene>

A *Pulse Generator* converts continuous signals into short pulses.

-----

## Pulse Extender

<GameScene interactive={true} zoom={1.5}>
  <Block x="1" y="0" z="1" id="minecraft:gold_block" />
  <Block x="2" y="0" z="1" id="minecraft:repeater"p:facing="east" p:delay="4" />
  <Block x="3" y="0" z="1" id="minecraft:gold_block" />
  <Block x="4" y="0" z="1" id="minecraft:repeater"p:facing="east" p:delay="4" />
  <Block x="5" y="0" z="1" id="minecraft:gold_block" />
  <Block x="6" y="0" z="1" id="minecraft:repeater"p:facing="east" p:delay="4" />
  <Block x="7" y="0" z="1" id="minecraft:gold_block" />
  <Block x="8" y="0" z="1" id="minecraft:repeater"p:facing="east" p:delay="4" />
  <Block x="9" y="0" z="1" id="minecraft:gold_block" />
  <Block x="10" y="0" z="1" id="minecraft:repeater"p:facing="east" p:delay="4" />
  <Block x="11" y="0" z="1" id="minecraft:redstone_wire"p:east="side" p:north="side" />
  <Block x="0" y="0" z="2" id="minecraft:redstone_lamp"p:lit="false" />
  <Block x="1" y="0" z="2" id="minecraft:redstone_wire" p:west="side" p:east="side" />
  <Block x="2" y="0" z="2" id="minecraft:redstone_wire" p:west="side" p:east="side" />
  <Block x="3" y="0" z="2" id="minecraft:redstone_wire" p:west="side" p:east="side" />
  <Block x="4" y="0" z="2" id="minecraft:redstone_wire" p:west="side" p:east="side" />
  <Block x="5" y="0" z="2" id="minecraft:redstone_wire" p:west="side" p:east="side" />
  <Block x="6" y="0" z="2" id="minecraft:redstone_wire" p:west="side" p:east="side" />
  <Block x="7" y="0" z="2" id="minecraft:redstone_wire" p:west="side" p:east="side" />
  <Block x="8" y="0" z="2" id="minecraft:redstone_wire" p:west="side" p:east="side" />
  <Block x="9" y="0" z="2" id="minecraft:redstone_wire" p:west="side" p:east="side" />
  <Block x="10" y="0" z="2" id="minecraft:gold_block" />
  <Block x="11" y="0" z="2" id="minecraft:redstone_wire"p:west="side" p:south="side" />
  <Block x="12" y="0" z="2" id="minecraft:stone_button"p:face="floor" p:facing="north" p:powered="false" />
</GameScene>

This circuit increases the duration of a pulse. 
Can be built as long as you like.

