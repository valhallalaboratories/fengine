package es.valhalla.web.fermi.engine.component.boxmodel

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ComponentBoxTest {
	@Test
	fun testA4ComponentBoxSize() {
		val a4ComponentBox = ComponentBox.PAGE_BASE_A4

		assertThat(a4ComponentBox.width.points).isEqualTo(595)
		assertThat(a4ComponentBox.height.points).isEqualTo(842)
	}

	@Test
	fun testEmptyComponentSize() {
		val emptyComponentBox = ComponentBox.INLINE_COMPONENT_BOX_MODEL

		assertThat(emptyComponentBox.width.points)
			.describedAs("Check if the width of the empty component box is 0")
			.isEqualTo(0)
		assertThat(emptyComponentBox.height.points)
			.describedAs("Check if the height of the empty component box is 0")
			.isEqualTo(0)
	}

	@Test
	fun `test empty component effective size (in points) with padding size defined at 144 dpis`() {
		val emptyComponentBox =
			ComponentBox.INLINE_COMPONENT_BOX_MODEL.copy(
				paddings = Paddings.buildSameSizePaddings(PixelSize(10, dpi = 144)),
			)

		assertThat(emptyComponentBox.effectiveWidth)
			.describedAs("Check if the effective width of the empty component box with padding is 10")
			.isEqualTo(10)
		assertThat(emptyComponentBox.effectiveHeight)
			.describedAs("Check if the effective height of the empty component box with padding is 10")
			.isEqualTo(10)
	}
}
