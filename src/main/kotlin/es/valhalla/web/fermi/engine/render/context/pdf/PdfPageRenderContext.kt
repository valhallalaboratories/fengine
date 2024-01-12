package es.valhalla.web.fermi.engine.render.context.pdf

import es.valhalla.web.fermi.engine.render.context.DocumentSectionRenderContext
import es.valhalla.web.fermi.engine.render.context.PageContainerRenderContext
import org.apache.pdfbox.pdmodel.PDPage

data class PdfPageRenderContext(
	val pdfPage: PDPage,
	override val posX: Int = 0,
	override val posY: Int = 0,
	override val renderingMilliseconds: Long,
	override val parentContext: DocumentSectionRenderContext
) : PageContainerRenderContext(
	posX = posX,
	posY = posY,
	renderingMilliseconds = renderingMilliseconds,
	parentContext = parentContext
)
