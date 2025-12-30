---
navigation:
  title: "Redstone Components"
  icon: "minecraft:redstone_torch"
  position: 2
  parent: lexicon:redstone.md
---

# Redstone Components

__Different categories:__ 

- A __power component__ provides power to other parts of a circuit [e.g. <ItemLink id="minecraft:redstone_torch" />] 

- A __transmission component__ passes power from one part of the circuit to another [e.g. <ItemLink id="minecraft:redstone" />] 

-  A __mechanism component__ affects the environment (by moving, light, etc.) [e.g. <ItemLink id="minecraft:piston" />]

-----

<a name="redstone"></a>
<ItemImage id="minecraft:redstone" />

<ItemLink id="minecraft:redstone" /> is the core of redstone mechanics. 

Mined from <ItemLink id="minecraft:redstone_ore" />, the dust can be placed to form redstone wires to carry signals, or crafted into other devices.

<Row> <RecipesFor id="minecraft:redstone" /> </Row>

-----

<a name="torch"></a>
<ItemImage id="minecraft:redstone_torch" />

A <ItemLink id="minecraft:redstone_torch" /> can be used to power blocks and transmission components such as <ItemLink id="minecraft:redstone" />, 
activate mechanism components such as [*Pistons*](./redstone_components.md#piston), or invert redstone signals like a [*NOT Gate*](./redstone_circuits.md).

<Row> <RecipesFor id="minecraft:redstone_torch" /> </Row>

-----

<ItemImage id="minecraft:redstone_block" />

A <ItemLink id="minecraft:redstone_block" /> acts as a permanently powered redstone power source that can be pushed by [<ItemLink id="minecraft:piston" />'s](./redstone_components.md#piston).

<Row> <RecipesFor id="minecraft:redstone_block" /> </Row>

-----

<a name="repeater"></a>
<ItemImage id="minecraft:repeater" />

A <ItemLink id="minecraft:repeater" /> is a block used in [*redstone circuits*](redstone_circuits.md) to repeat redstone signals back to full strength, 
delay signals, prevent signals moving backwards, or to lock signals in one state. 

- Transmits signals only from its back to its front
- They can repeat a redstone signal, boosting it back up
- <ItemLink id="minecraft:repeater" /> delay signals, the delay can be changed by right-clicking 
- <ItemLink id="minecraft:repeater" /> can be locked by another powered <ItemLink id="minecraft:repeater" /> or <ItemLink id="minecraft:comparator" /> facing it's side. When locked, the repeater does not change its 
output

<Row> <RecipesFor id="minecraft:repeater" /> </Row>

-----

<a name="comparator"></a>
<ItemImage id="minecraft:comparator" />

A <ItemLink id="minecraft:comparator" /> is used to maintain, compare, or subtract signal strength, or to measure certain block states. 
- The back torches turn on when the output is greater than zero. 
- The front torch has two states that can be toggled by using: 
  - Down and unpowered (indicating the comparator is in __comparison mode__) 
  - Up and powered (indicating the comparator is in __subtraction mode__)
- Can take a signal strength input from its rear as well as from both sides.
- Side inputs are accepted only from <ItemLink id="minecraft:redstone" />, <ItemLink id="minecraft:redstone_block" />, <ItemLink id="minecraft:repeater" />, 
other <ItemLink id="minecraft:comparator" />*'s*, & <ItemLink id="minecraft:observer" /> in specific scenarios.
- The front is the output.

<Row> <RecipesFor id="minecraft:comparator" /> </Row>

-----

<ItemImage id="minecraft:stone_button" />

When activated, a *Wooden Button* remains active for 15 redstone ticks (1.5s, barring lag), while a <ItemLink id="minecraft:stone_button" /> remains active for 10 redstone ticks (1s, barring lag). 

A *Wooden Button* activated by a fired <ItemLink id="minecraft:arrow" /> or a <ItemLink id="minecraft:trident" /> remains active until the projectile despawns or is picked up.

<Row> 
    <RecipesFor id="minecraft:stone_button" /> <Recipe id="minecraft:oak_button" /> <Recipe id="minecraft:birch_button" /> <Recipe id="minecraft:spruce_button" />
    <Recipe id="minecraft:jungle_button" /> <Recipe id="minecraft:dark_oak_button" /> <Recipe id="minecraft:acacia_button" /> <Recipe id="minecraft:bamboo_button" />
    <Recipe id="minecraft:cherry_button" /> <Recipe id="minecraft:mangrove_button" /> <Recipe id="minecraft:pale_oak_button" /> <Recipe id="minecraft:crimson_button" />
    <Recipe id="minecraft:warped_button" />
</Row>



-----

<a name="lever"></a>
<ItemImage id="minecraft:lever" />

A <ItemLink id="minecraft:lever" /> emits redstone power when activated.

<Row> <RecipesFor id="minecraft:lever" /> </Row>

-----

<a name="pressure_plate"></a>
## Pressure Plates

<ItemImage id="minecraft:stone_pressure_plate" />


- *Wooden Plates* can detect all entities, giving out a signal of 15
- <ItemLink id="minecraft:stone_pressure_plate" />can detect only [*Players*](../creatures/human-player.md) and [*Mobs*](../creatures.md), giving out a signal of 15
- <ItemLink id="minecraft:light_weighted_pressure_plate" /> can detect all entities and the signal strength that it outputs increases as more entities are added
- <ItemLink id="minecraft:heavy_weighted_pressure_plate" /> measures groups of 10 entities

<Row>
    <RecipesFor id="minecraft:light_weighted_pressure_plate" /> <RecipesFor id="minecraft:heavy_weighted_pressure_plate" /> <RecipesFor id="minecraft:stone_pressure_plate" /> 
    <Recipe id="minecraft:oak_pressure_plate" /> <Recipe id="minecraft:birch_pressure_plate" /> <Recipe id="minecraft:spruce_pressure_plate" /> 
    <Recipe id="minecraft:jungle_pressure_plate" /> <Recipe id="minecraft:dark_oak_pressure_plate" /> <Recipe id="minecraft:acacia_pressure_plate" /> 
    <Recipe id="minecraft:bamboo_pressure_plate" /> <Recipe id="minecraft:cherry_pressure_plate" /> <Recipe id="minecraft:mangrove_pressure_plate" /> 
    <Recipe id="minecraft:pale_oak_pressure_plate" /> <Recipe id="minecraft:crimson_pressure_plate" /> <Recipe id="minecraft:warped_pressure_plate" />
</Row>
-----

<a name="tripwire"></a>
<ItemImage id="minecraft:tripwire_hook" />

A <ItemLink id="minecraft:tripwire_hook" /> can be used to detect [*Mobs*](../creatures.md), *items*, and other *entities* over a large area. 

To use it you have to place 2 hooks opposite each other on walls and connect them with <ItemLink id="minecraft:string" />, now when an entity touches the thread the hooks emit a signal.

<Row> <RecipesFor id="minecraft:tripwire_hook" /> </Row>

-----

<a name="observer"></a>
<ItemImage id="minecraft:observer" />

A <ItemLink id="minecraft:observer" /> detects changes in its target's block states, or the breaking or placing of a block (i.e. changes in its block state). 

This means that changes like the age of *Crops* can be detected because they are part of the block states.

<Row> <RecipesFor id="minecraft:observer" /> </Row>

-----

<ItemImage id="minecraft:daylight_detector" />

A <ItemLink id="minecraft:daylight_detector" /> is a block that outputs a redstone signal based on sunlight. 

The detector can be inverted when *right-clicked*.

<Row> <RecipesFor id="minecraft:daylight_detector" /> </Row>

-----

<a name="piston"></a>
<ItemImage id="minecraft:piston" />

A <ItemLink id="minecraft:piston" /> is capable of pushing blocks, [*Players*](../creatures/human-player.md), and [*Mobs*](../creatures.md) when given a redstone pulse.

<Row> <RecipesFor id="minecraft:piston" /> </Row>

-----

<a name="sticky_piston"></a>
<ItemImage id="minecraft:sticky_piston" />

A <ItemLink id="minecraft:sticky_piston" /> has the same function as a <ItemLink id="minecraft:piston" /> but can also pull the block on its face back when it retracts, unlike the regular one, which leaves the pushed 
block in place.

<Row> <RecipesFor id="minecraft:sticky_piston" /> </Row>

-----

<a name="dispenser"></a>
<ItemImage id="minecraft:dispenser" />

A <ItemLink id="minecraft:dispenser" /> is a block used as a redstone component to dispense items. 

Most items are just thrown out, but a few behave differently (e.g. *Armor* equips on a [*Player*](../creatures/human-player.md) of [*Mob*](../creatures.md), projectiles are fired out, *Buckets* or some tools are used, ...)

<Row> <RecipesFor id="minecraft:dispenser" /> </Row>

-----

<a name="dropper"></a>
<ItemImage id="minecraft:dropper" />

A <ItemLink id="minecraft:dropper" /> is a block that can be used to drop items or to push items into another container.

<Row> <RecipesFor id="minecraft:dropper" /> </Row>

-----

<a name="noteblock"></a>
<ItemImage id="minecraft:note_block" />

A <ItemLink id="minecraft:note_block" /> is a musical block that emits sounds when used or powered with redstone. 

- The sound type depends on the block below
- Pressing use on the block increases the note pitch up a semitone.
- A [<ItemLink id="minecraft:note_block" />](../tips/noteblock.md) must have air in the space directly above it to play a sound.


<Row> <RecipesFor id="minecraft:note_block" /> </Row>

-----

<a name="hopper"></a>
<ItemImage id="minecraft:hopper" />

While a <ItemLink id="minecraft:hopper" /> is not powered by redstone signals, it operates with three functions: 

- Collect item entities (free-floating items in the world) into its inventory from above it
- Pull a single item into its inventory from a container above it
- Push a single item from its own inventory into a container it faces


You can control the direction while aiming at the surface to which its output should face.

To place a <ItemLink id="minecraft:hopper" /> directly on the face of an already interactable block, the [*Player*](../creatures/human-player.md) can sneak while placing the <ItemLink id="minecraft:hopper" />.

<Row> <RecipesFor id="minecraft:hopper" /> </Row>

-----

<a name="door"></a>
## Doors & Gates

<ItemImage id="minecraft:oak_door" />

*Doors* or *Gates* are blocks that can be used as a barrier that can be opened by hand or with redstone. 

But *Doors* or *Gates* made of iron can only be opened with redstone.

<Row>
    <RecipesFor id="minecraft:oak_door" /> <RecipesFor id="minecraft:birch_door" /> <RecipesFor id="minecraft:jungle_door" /> <RecipesFor id="minecraft:iron_door" />
    <RecipesFor id="minecraft:spruce_trapdoor" /> <RecipesFor id="minecraft:bamboo_trapdoor" /> <RecipesFor id="minecraft:crimson_trapdoor" /> <RecipesFor id="minecraft:iron_trapdoor" />
    <RecipesFor id="minecraft:jungle_fence_gate" /> <RecipesFor id="minecraft:acacia_fence_gate" /> <RecipesFor id="minecraft:pale_oak_fence_gate" /> 
</Row>

-----

<a name="lamp"></a>
<ItemImage id="minecraft:redstone_lamp" />

A <ItemLink id="minecraft:redstone_lamp" /> is a block that produces light when activated with a redstone signal.

<Row> <RecipesFor id="minecraft:redstone_lamp" /> </Row>

-----

<a name="bulb"></a>
<ItemImage id="minecraft:copper_bulb" />

A <ItemLink id="minecraft:copper_bulb" /> can be activated to emit light, with the light level emitted decreasing for each stage of oxidation. 
When the bulb receives a redstone pulse, it immediately toggles between its lit and unlit states. 
A [<ItemLink id="minecraft:comparator" />](./redstone_components.md#comparator) can read the state, and it emits a signal strength of 15 if the bulb is lit. 
If the bulb is unlit, the [<ItemLink id="minecraft:comparator" />](./redstone_components.md#comparator) does not emit any power, allowing this [<ItemLink id="minecraft:comparator" />](./redstone_components.md#comparator) 
and <ItemLink id="minecraft:copper_bulb" /> combination to act as a compact [T Flip-Flop](./redstone_circuits.md#t-flip-flop).

<Row> <RecipesFor id="minecraft:copper_bulb" /> <RecipesFor id="minecraft:waxed_copper_bulb" /> </Row>

-----

<ItemImage id="minecraft:trapped_chest" />

A [<ItemLink id="minecraft:trapped_chest" />](../useables/trapped_chest.md) functions as a normal [<ItemLink id="minecraft:chest" />](../useables/chest.md) for item storage, but it produces redstone power when opened. 

It can be visually distinguished from a normal [<ItemLink id="minecraft:chest" />](../useables/chest.md) by a red coloration around the latch.

<Row> <RecipesFor id="minecraft:trapped_chest" /> </Row>

-----

<ItemImage id="minecraft:target" />

A <ItemLink id="minecraft:target" /> is a block that provides a temporary redstone charge when hit by a projectile like an <ItemLink id="minecraft:arrow" />. It also has utility in redstone circuitry for redirecting
<ItemLink id="minecraft:redstone" />, making it a useful redstone component.

<Row> <RecipesFor id="minecraft:target" /> </Row>

-----

<ItemImage id="minecraft:crafter" />

When a <ItemLink id="minecraft:crafter" /> receives a signal, it ejects one crafted item using the ingredients from the nine inventory slots. 
If the front of a <ItemLink id="minecraft:crafter" /> is facing a container (including another <ItemLink id="minecraft:crafter" />), the crafted items are transferred into the container. 
For shaped recipes, the position of the items in the inventory matters.

Because disabled slots prevent items from entering the slot, *Crafters* can be used to craft any item automatically without any input from the [*Player*](../creatures/human-player.md), 
using a series of [<ItemLink id="minecraft:hopper" />](./redstone_components.md#hopper) and/or [<ItemLink id="minecraft:dropper" />](./redstone_components.md#dropper) & the correct configuration of disabled slots for 
the recipe.

<Row> <RecipesFor id="minecraft:crafter" /> </Row>

-----

<ItemImage id="minecraft:detector_rail" />

If the <ItemLink id="minecraft:minecart" /> on the <ItemLink id="minecraft:detector_rail" /> is a <ItemLink id="minecraft:chest_minecart" /> or <ItemLink id="minecraft:hopper_minecart" />, an adjacent 
[<ItemLink id="minecraft:comparator" />](./redstone_components.md#comparator) facing away from the <ItemLink id="minecraft:detector_rail" /> outputs a power level proportional to the container's fullness.

<Row> <RecipesFor id="minecraft:detector_rail" /> </Row>

-----

<ItemImage id="minecraft:sculk_sensor" />

The <ItemLink id="minecraft:sculk_sensor" /> is a block that detects vibrations caused by actions and events, and emits a redstone signal. 

These sensors can also be used to realize wireless redstone mechanics. 

Each vibration in the game falls under a certain [amplitude value](https://minecraft.fandom.com/wiki/Sculk_Sensor#Vibration_Resonance). 
This value can be measured with a [<ItemLink id="minecraft:comparator" />](./redstone_components.md#comparator).


 If a *Wool* or *Carpet* is placed between a sensor and a vibration source, the sensor is not able to detect the placed *Wool* nor vibrations behind it. 

<ItemLink id="minecraft:sculk_sensor" />*'s* generate within the *Deep Dark* biome and [*Ancient Cities*](../world/structures.md#ancient_city).

<Row> <RecipesFor id="minecraft:sculk_sensor" /> </Row>

-----

<ItemImage id="minecraft:calibrated_sculk_sensor" />

Similarly to its counterpart detects the <ItemLink id="minecraft:calibrated_sculk_sensor" /> vibrations, but with twice the range, and can detect multiple vibrations in quicker succession. 

It outputs a signal on all sides except for its input, which can receive power to make the sensor only listen to specific vibrations, depending on the input signal strength.

<Row> <RecipesFor id="minecraft:calibrated_sculk_sensor" /> </Row>

-----

<a name="command_block"></a>
<ItemImage id="minecraft:command_block" />

A <ItemLink id="minecraft:command_block" /> is a block that can execute [*Commands*](../commands.md). 

__There are 3 variants:__ 
- An *Impulse* <ItemLink id="minecraft:command_block" /> is the default block type, it executes only once when activated. 
- A <ItemLink id="minecraft:chain_command_block" /> executes every time when triggered. 
- A <ItemLink id="minecraft:repeating_command_block" /> executes every game tick as long as it is activated.

Because it __cannot be obtained or edited in Survival mode without cheats__, it is primarily used on multiplayer servers, in Creative worlds, and custom maps.

<Row> <RecipesFor id="minecraft:command_block" /> <RecipesFor id="minecraft:chain_command_block" /> <RecipesFor id="minecraft:repeating_command_block" /> </Row>

-----

<a name="structure_block"></a>
<ItemImage id="minecraft:structure_block" />

A <ItemLink id="minecraft:structure_block" /> is used to generate structures manually. 

They can also be used to save and load structures, alongside <ItemLink id="minecraft:structure_void" /> blocks.

<Row> <RecipesFor id="minecraft:structure_block" /> </Row>