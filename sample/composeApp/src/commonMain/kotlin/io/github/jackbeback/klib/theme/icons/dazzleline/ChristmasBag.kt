package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChristmasBag: ImageVector
    get() {
        if (_ChristmasBag != null) {
            return _ChristmasBag!!
        }
        _ChristmasBag = ImageVector.Builder(
            name = "ChristmasBag",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.985f, 9f)
                verticalLineTo(18f)
                moveTo(10.848f, 9.5f)
                lineTo(11.985f, 10.5f)
                lineTo(13.122f, 9.5f)
                moveTo(10.848f, 17.5f)
                lineTo(11.985f, 16.5f)
                lineTo(13.122f, 17.5f)
                moveTo(7.569f, 11.25f)
                lineTo(16.43f, 15.75f)
                moveTo(8.898f, 11.925f)
                lineTo(7.501f, 12.255f)
                moveTo(8.897f, 11.925f)
                lineTo(8.522f, 10.696f)
                moveTo(15.477f, 16.304f)
                lineTo(15.102f, 15.075f)
                lineTo(16.5f, 14.746f)
                moveTo(16.43f, 11.25f)
                lineTo(7.569f, 15.75f)
                moveTo(8.9f, 15.075f)
                lineTo(8.526f, 16.304f)
                moveTo(8.898f, 15.075f)
                lineTo(7.501f, 14.746f)
                moveTo(16.5f, 12.255f)
                lineTo(15.102f, 11.925f)
                lineTo(15.477f, 10.696f)
                moveTo(15f, 6f)
                curveTo(15f, 5.068f, 15f, 4.602f, 14.848f, 4.235f)
                curveTo(14.645f, 3.745f, 14.256f, 3.355f, 13.766f, 3.152f)
                curveTo(13.398f, 3f, 12.932f, 3f, 12f, 3f)
                curveTo(11.069f, 3f, 10.603f, 3f, 10.235f, 3.152f)
                curveTo(9.745f, 3.355f, 9.356f, 3.745f, 9.153f, 4.235f)
                curveTo(9.001f, 4.602f, 9f, 5.068f, 9f, 6f)
                moveTo(4.001f, 6f)
                horizontalLineTo(20f)
                lineTo(20.773f, 17.587f)
                curveTo(20.852f, 18.774f, 20.892f, 19.367f, 20.685f, 19.824f)
                curveTo(20.504f, 20.225f, 20.195f, 20.556f, 19.806f, 20.764f)
                curveTo(19.364f, 21f, 18.769f, 21f, 17.58f, 21f)
                horizontalLineTo(6.421f)
                curveTo(5.232f, 21f, 4.637f, 21f, 4.195f, 20.764f)
                curveTo(3.806f, 20.556f, 3.497f, 20.225f, 3.316f, 19.824f)
                curveTo(3.109f, 19.367f, 3.149f, 18.774f, 3.228f, 17.587f)
                lineTo(4.001f, 6f)
                close()
            }
        }.build()

        return _ChristmasBag!!
    }

@Suppress("ObjectPropertyName")
private var _ChristmasBag: ImageVector? = null
