package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DiagramCells: ImageVector
    get() {
        if (_DiagramCells != null) {
            return _DiagramCells!!
        }
        _DiagramCells = ImageVector.Builder(
            name = "DiagramCells",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(3f, 7f)
                curveTo(3f, 6.068f, 3f, 5.602f, 3.152f, 5.235f)
                curveTo(3.355f, 4.745f, 3.745f, 4.355f, 4.235f, 4.152f)
                curveTo(4.602f, 4f, 5.068f, 4f, 6f, 4f)
                horizontalLineTo(18f)
                curveTo(18.932f, 4f, 19.398f, 4f, 19.765f, 4.152f)
                curveTo(20.255f, 4.355f, 20.645f, 4.745f, 20.848f, 5.235f)
                curveTo(21f, 5.602f, 21f, 6.068f, 21f, 7f)
                curveTo(21f, 7.932f, 21f, 8.398f, 20.848f, 8.765f)
                curveTo(20.645f, 9.255f, 20.255f, 9.645f, 19.765f, 9.848f)
                curveTo(19.398f, 10f, 18.932f, 10f, 18f, 10f)
                horizontalLineTo(6f)
                curveTo(5.068f, 10f, 4.602f, 10f, 4.235f, 9.848f)
                curveTo(3.745f, 9.645f, 3.355f, 9.255f, 3.152f, 8.765f)
                curveTo(3f, 8.398f, 3f, 7.932f, 3f, 7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(3f, 17f)
                curveTo(3f, 16.068f, 3f, 15.602f, 3.152f, 15.235f)
                curveTo(3.355f, 14.745f, 3.745f, 14.355f, 4.235f, 14.152f)
                curveTo(4.602f, 14f, 5.068f, 14f, 6f, 14f)
                horizontalLineTo(18f)
                curveTo(18.932f, 14f, 19.398f, 14f, 19.765f, 14.152f)
                curveTo(20.255f, 14.355f, 20.645f, 14.745f, 20.848f, 15.235f)
                curveTo(21f, 15.602f, 21f, 16.068f, 21f, 17f)
                curveTo(21f, 17.932f, 21f, 18.398f, 20.848f, 18.765f)
                curveTo(20.645f, 19.255f, 20.255f, 19.645f, 19.765f, 19.848f)
                curveTo(19.398f, 20f, 18.932f, 20f, 18f, 20f)
                horizontalLineTo(6f)
                curveTo(5.068f, 20f, 4.602f, 20f, 4.235f, 19.848f)
                curveTo(3.745f, 19.645f, 3.355f, 19.255f, 3.152f, 18.765f)
                curveTo(3f, 18.398f, 3f, 17.932f, 3f, 17f)
                close()
            }
        }.build()

        return _DiagramCells!!
    }

@Suppress("ObjectPropertyName")
private var _DiagramCells: ImageVector? = null
